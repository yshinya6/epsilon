package src.epsilon;

import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

import nez.tool.CommonWriter;

public class EpsilonSynthesizer extends CommonWriter implements NameSample, Ratio, Distribution {

	long currentFileSize;

	public long getFileSize() {
		return this.currentFileSize;
	}

	public void CL() {
		currentFileSize += 1;
		L();
	}

	public void CL(String text) {
		currentFileSize += text.length() + (IndentLevel * 3) + 1;
		L(text);
	}

	public void CL(String text, Object... args) {
		int length = text.length() + (IndentLevel * 3) + 1;
		length -= 2 * args.length;
		for (Object object : args) {
			length += object.toString().length();
		}
		currentFileSize += length;
		L(text, args);
	}

	public void _CL(String text) {
		currentFileSize += text.length();
		_L(text);
	}

	public void _CL(String text, Object... args) {
		int length = text.length();
		length -= 2 * args.length;
		for (Object object : args) {
			length += object.toString().length();
		}
		currentFileSize += length;
		_L(text, args);
	}

	// private long BlockCount = 0;
	// private long DeclarationCount = 0;
	// private long StatementCount = 0;
	// private long ExpressionCount = 0;
	// private long ConditionalCount = 0;

	private long maxFilesize = 0;
	private int maxDeclarationDepth = 1;
	private int currentDeclarationDepth = 0;
	private int currentStatementDepth = 0;
	private int maxStatementDepth = 1;

	public EpsilonSynthesizer(double sizeFactor) {
		this.currentFileSize = 0;
		if (sizeFactor > 0.001) {
			/* SizeFactor = 1.0 <=> 1KB */
			this.maxFilesize = (long) (sizeFactor * 1024);
		} else {
			System.err.println(String.format("Invalid SizeFactor: %s", sizeFactor));
			System.exit(1);
		}
	}

	private boolean isOverMaxSize() {
		return currentFileSize > maxFilesize;
	}

	public void synthesize() {
		newInitFunction();
	}

	private void initDepthParameters() {
		// maxDeclarationDepth = getRandomNumber(DeclarationDepthDistribution);
		// maxStatementDepth = getRandomNumber(StatementDepthDistribution);
		maxDeclarationDepth = 4;
		maxStatementDepth = 4;
		currentDeclarationDepth = 0;
		currentStatementDepth = 0;
	}

	// Initial Function

	private void newInitFunction() {
		String functionName = getFunctionName();
		CL("function %s (%s) {", functionName, getFunctionParamList());
		incIndent();
		while (!isOverMaxSize()) {
			initDepthParameters();
			// newBlockInner();
			newFunctionDeclaration();
		}
		decIndent();
		CL("}");
	}

	// Block

	private void newBlock() {
		// int breadth = (isOverMaxSize()) ? 1 :
		// getRandomNumber(DeclarationBreadthDistribution);
		int breadth = (isOverMaxSize()) ? 1 : declBreadthCList.getNext();
		CL("{");
		incIndent();
		for (int i = 0; i < breadth; i++) {
			if (isOverMaxSize()) {
				break;
			}
			newBlockInner();
		}
		decIndent();
		CL("}");
	}

	private void newBlockInner() {
		// if (getRandomNumber(CommentRatio) == 1 /* In case of inserting
		// comment */) {
		// newComment();
		// return;
		// }
		// int selector = getRandomNumber(BlockRatio);
		int selector = blockCList.getNext();
		if (selector == 0 /* Statement */) {
			newStatement();
			return;
		} else {
			newDeclaration();
			return;
		}
	}

	private void newComment() {
		// residualElementCount--;
		if (isOverMaxSize()) {
			CL("// Final Comment");
		}
		CL("/*%s*/", getComment());
	}

	private String getComment() {
		// FIXME comment size is heuristic number
		int commentSize = 5;
		StringBuilder comment = new StringBuilder();
		for (int i = 0; i < commentSize; i++) {
			// comment.append(getRandomName(StringValues));
			comment.append(stringValueCList.getNext());
			comment.append(" ");
		}
		return comment.toString();
	}

	// Declaration

	private void newDeclaration() {
		// residualElementCount--;
		if (isOverMaxSize() || (currentDeclarationDepth + 1 > maxDeclarationDepth)) {
			newVariableDeclaration();
			return;
		}
		currentDeclarationDepth++;
		// int selector = getRandomNumber(DeclarationRatio);
		int selector = declCList.getNext();
		if (selector == 0 /* VarDecl */) {
			newVariableDeclaration();
		} else {
			newFunctionDeclaration();
		}
		currentDeclarationDepth--;
	}

	private void newFunctionDeclaration() {
		String functionName = getFunctionName();
		// int breadth = (isOverMaxSize()) ? 1 :
		// getRandomNumber(StatementBreadthDistribution);
		int breadth = 5;
		CL("function %s (%s) {", functionName, getFunctionParamList());
		incIndent();
		for (int i = 0; i < breadth - 1; i++) {
			if (isOverMaxSize()) {
				break;
			}
			newBlockInner();
		}
		newReturn();
		decIndent();
		CL("}");
	}

	private String getFunctionParamList() {
		StringJoiner sj = new StringJoiner(", ");
		// int paramBreadth = (isOverMaxSize()) ? 0 :
		// getRandomNumber(FunctionParamDistribution);
		int paramBreadth = (isOverMaxSize()) ? 0 : functionParamCList.getNext();
		for (int i = 0; i < paramBreadth; i++) {
			sj.add(getVarName());
		}
		return sj.toString();
	}

	private void newVariableDeclaration() {
		if (isOverMaxSize()) {
			CL("var last = true;");
			return;
		}
		// int breadth = getRandomNumber(VarInitDistribution);
		int breadth = varInitCList.getNext();
		// int typeSelector = getRandomNumber(TypeRatio);
		int typeSelector = typeCList.getNext();
		StringJoiner sj = new StringJoiner(", ");
		for (int i = 0; i < breadth; i++) {
			sj.add(getInitializer(typeSelector));
		}
		CL("var %s;", sj.toString());
	}

	private String getInitializer(int typeSelector) {
		return String.format("%s = %s", getVarName(), genLiteral(typeSelector));
	}

	// Statement

	private void newStatement() {
		// int selector = getRandomNumber(StatementRatio);
		int selector = stmtCList.getNext();

		if (isOverMaxSize() || (currentStatementDepth + 1 > maxStatementDepth)) {
			newExpressionStatement();
			return;
		}
		currentStatementDepth++;
		switch (selector) {
		case 0:
			newExpressionStatement();
			break;
		case 1:
			newIf();
			break;
		case 2:
			newReturn();
			break;
		default:
			newExpressionStatement();
			break;
		}
		currentStatementDepth--;
	}

	private void newExpressionStatement() {
		if (isOverMaxSize()) {
			_CL("a");
		} else {
			newExpression();
		}
		_CL(";");
	}

	private void newIf() {
		CL("if (%s) ", genCondition());
		newBlock();
		if (isOverMaxSize()) {
			return;
		}
		CL(" else ");
		newBlock();
	}

	private String genCondition() {
		initExprDepth();
		currentExprDepth++;
		String expr = genConditionalExpression();
		currentExprDepth--;
		return expr;
	}

	private void newReturn() {
		CL("return %s;", genPrimaryExpression());
	}

	// Expression
	int exprDepth = 1;
	int currentExprDepth = 0;

	private void initExprDepth() {
		// exprDepth = getRandomNumber(ExpressionDepthDistribution);
		exprDepth = exprDepthCList.getNext();
		currentExprDepth = 0;
	}

	private void newExpression() {
		// int selector = getRandomNumber(ExpressionRatio);
		int selector = exprCList.getNext();
		initExprDepth();
		currentExprDepth++;
		selectExpression(selector);
		currentExprDepth--;
	}

	private void selectExpression(int selector) {
		// [expression] 0:Reference, 1:Apply, 2:Literal, 3:Conditional, 4:Assign
		switch (selector) {
		case 0:
			newNameReference();
			break;
		case 1:
			newApply();
			break;
		case 2:
			newFunctionExpression();
			break;
		case 3:
			newConditionalExpression();
			break;
		case 4:
			newAssignExpression();
			break;
		default:
			newNameReference();
			break;
		}
	}

	private void newNameReference() {
		CL(genNameReference());
	}

	private String genNameReference() {
		// return getRandomName(VarNameList);
		return varNameCList.getNext();
	}

	private void newApply() {
		CL(genApply());
	}

	private String genApply() {
		// int paramBreadth = getRandomNumber(FunctionParamDistribution);
		int paramBreadth = functionParamCList.getNext();
		StringJoiner sj = new StringJoiner(", ");
		for (int i = 0; i < paramBreadth; i++) {
			sj.add(genPrimaryExpression());
		}
		return String.format("%s(%s)", getFunctionName(), sj.toString());
	}

	private void newFunctionExpression() {
		String functionName = getFunctionName();
		String paramList = getFunctionParamList();
		// int breadth = (isOverMaxSize()) ? 0 :
		// getRandomNumber(StatementBreadthDistribution);
		int breadth = (isOverMaxSize()) ? 0 : stmtBreadthCList.getNext();
		CL("function %s (%s) {", functionName, paramList);
		incIndent();
		for (int i = 0; i < breadth - 1; i++) {
			if (isOverMaxSize()) {
				break;
			}
			newBlockInner();
		}
		newReturn();
		decIndent();
		CL("}::(%s)", paramList);
	}

	private String genPrimaryExpression() {
		// int selector = getRandomNumber(PrimaryExpressionRatio);
		int selector = primaryCList.getNext();
		switch (selector) {
		case 0:
			return genNameReference();
		case 1:
			return genApply();
		case 2:
			return genLiteral();
		default:
			return genNameReference();
		}
	}

	private void newConditionalExpression() {
		CL(genConditionalExpression());
	}

	private String genConditionalExpression() {
		String left = null;
		String right = null;
		if (!isOverMaxSize() && (++currentExprDepth < exprDepth)) {
			left = genSubConditionalExpression();
			right = genSubConditionalExpression();
		} else {
			left = genPrimaryExpression();
			right = genPrimaryExpression();
		}
		currentExprDepth--;
		return combineConditionalOperator(left, right);
	}

	private String combineConditionalOperator(String left, String right) {
		// int selector = getRandomNumber(ConditionalExpressionRatio);
		int selector = condCList.getNext();
		String expr = null;
		switch (selector) {
		case 0:
			expr = left + " || " + right;
			break;
		case 1:
			expr = left + "&&" + right;
			break;
		case 2:
			expr = left + "==" + right;
			break;
		case 3:
			expr = left + "!=" + right;
			break;
		case 4:
			expr = left + "<" + right;
			break;
		case 5:
			expr = left + ">" + right;
			break;
		case 6:
			expr = "!" + left;
			break;
		default:
			expr = left + "==" + right;
			break;
		}
		return expr;
	}

	private String genSubConditionalExpression() {
		return String.format("(%s)", genConditionalExpression());
	}

	private void newAssignExpression() {
		CL(genAssignExpression());
	}

	private String genAssignExpression() {
		return String.format("%s = %s", genNameReference(), genPrimaryExpression());
	}

	// Literal

	private String genLiteral() {
		// return genLiteral(getRandomNumber(LiteralRatio));
		return genLiteral(literalCList.getNext());
	}

	private String genLiteral(int typeSelector) {
		// [type] 0:Boolean, 1:Integer, 2:String, 3:Long
		switch (typeSelector) {
		case 0:
			return getBooleanValue();
		case 1:
			return getIntegerValue();
		case 2:
			return getStringValue();
		case 3:
			return getIntegerValue();
		default:
			return getIntegerValue();
		}
	}

	String getBooleanValue() {
		return String.valueOf(BooleanRatio[random(BooleanRatio.length)]);
	}

	String getIntegerValue() {
		// return String.valueOf(random(getRandomNumber(IntegerValueUpBounds)));
		return String.valueOf(random(intLimitCList.getNext()));
	}

	String getStringValue() {
		// return getRandomName(StringValues);
		return stringValueCList.getNext();
	}

	String getNullValue() {
		return "null";
	}

	// Name

	private String getFunctionName() {
		// return getRandomName(FunctionNames);
		return functionNameCList.getNext();
	}

	private String getVarName() {
		// return getRandomName(VarNameList);
		return varNameCList.getNext();
	}

	// Utilities

	private int random(int lowbound, int upbound) {
		return ThreadLocalRandom.current().nextInt(lowbound, upbound);
	}

	private int random(int upbound) {
		return ThreadLocalRandom.current().nextInt(upbound);
	}

	private int random() {
		return ThreadLocalRandom.current().nextInt();
	}

	private int getRandomNumber(Integer[] list) {
		return list[random(list.length)];
	}

	private String getRandomName(String[] list) {
		return list[random(list.length)];
	}

	// Circular Linked List
	CircularList<Integer> blockCList = new CircularList<Integer>(BlockRatio);
	CircularList<Integer> declCList = new CircularList<Integer>(DeclarationRatio);
	CircularList<Integer> stmtCList = new CircularList<Integer>(StatementRatio);
	CircularList<Integer> exprCList = new CircularList<Integer>(ExpressionRatio);
	CircularList<Integer> condCList = new CircularList<Integer>(ConditionalExpressionRatio);
	CircularList<Integer> primaryCList = new CircularList<Integer>(PrimaryExpressionRatio);
	CircularList<Integer> literalCList = new CircularList<Integer>(LiteralRatio);
	CircularList<Boolean> booleanCList = new CircularList<Boolean>(BooleanRatio);
	CircularList<Integer> intLimitCList = new CircularList<Integer>(IntegerValueUpBounds);
	CircularList<Integer> typeCList = new CircularList<Integer>(TypeRatio);

	CircularList<Integer> declDepthCList = new CircularList<Integer>(DeclarationDepthDistribution);
	CircularList<Integer> stmtDepthCList = new CircularList<Integer>(StatementDepthDistribution);
	CircularList<Integer> exprDepthCList = new CircularList<Integer>(ExpressionDepthDistribution);
	CircularList<Integer> declBreadthCList = new CircularList<Integer>(DeclarationBreadthDistribution);
	CircularList<Integer> stmtBreadthCList = new CircularList<Integer>(StatementBreadthDistribution);
	CircularList<Integer> functionParamCList = new CircularList<Integer>(FunctionParamDistribution);
	CircularList<Integer> varInitCList = new CircularList<Integer>(VarInitDistribution);

	CircularList<String> varNameCList = new CircularList<String>(VarNameList);
	CircularList<String> intVarNameCList = new CircularList<String>(IntegerVarNames);
	CircularList<String> boolVarNameCList = new CircularList<String>(BooleanVarNames);
	CircularList<String> stringVarNameCList = new CircularList<String>(StringVarNames);
	CircularList<String> stringValueCList = new CircularList<String>(StringValues);
	CircularList<String> functionNameCList = new CircularList<String>(FunctionNames);
}
