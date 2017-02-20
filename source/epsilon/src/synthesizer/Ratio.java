package synthesizer;


/* All Lists are sorted randomly */
public interface Ratio {
	// [block] 0:Statement, 1:Declaration
	static final Integer[] BlockRatio = { 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1,
			0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0 };

	// [comment] 0:CodeBody, 1:Comment
	static final Integer[] CommentRatio = { 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 };

	// [declaration] 0:VaribleDeclaration, 1:FunctionDeclaration
	static final Integer[] DeclarationRatio = { 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1,
			0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 };

	// [statement] 0:ExpressionStatement, 1:ReturnStatement, 2:IfStatement
	static final Integer[] StatementRatio = { 0, 2, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 2, 2, 0, 1, 1, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 2, 0, 0, 0, 2, 0, 0, 2, 1, 0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0,
			0, 1, 2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 };

	// [expression] 0:ExpressionName, 1:FunctionCall, 2:Literal,
	// 3:Conditional, 4:Assign
	static final Integer[] OldExpressionRatio = { 0, 0, 1, 0, 3, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 3, 1, 3, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 3, 0, 0, 0, 1, 1, 0, 0, 0, 3, 0, 2, 1, 1, 0, 0, 0,
			0, 0, 1, 1, 4, 1, 2, 4, 0, 2, 2, 1, 4, 0, 1, 4, 0, 3, 2, 2, 1, 0, 1, 1, 2, 0, 0, 0, 3, 4, 0, 1 };

	// [expression] 0: ExpressionName, 1: MethodInvocation, 2: Literal,
	// 3:Assign, 4:Equals, 5:NotEquals, 6: Not, 7:And, 8:LessThan, 9: Or
	static final Integer[] ExpressionRatio = { 0, 2, 0, 1, 0, 1, 1, 3, 1, 1, 1, 0, 1, 2, 0, 1, 1, 0, 9, 0, 2, 1, 0, 6, 0, 1, 4, 7, 1, 4, 0, 0, 0, 5, 1, 1, 0, 1, 3, 0, 0, 0, 1, 1, 0, 0, 8, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 1, 0, 0, 1, 5, 2, 0, 1, 3, 1, 0, 0,
			1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 2, 3, 0, 0, 0, 3, 1, 2, 0, 1, 0, 1, 2, 0, 1, 3, 1, 0, 0 };

	// [conditional] 0:Or, 1:And, 2:Equals, 3:NotEquals, 4:LessThan,
	// 5:GreaterThan, 6:Not
	static final Integer[] ConditionalExpressionRatio = { 2, 3, 1, 2, 5, 6, 4, 3, 1, 3, 3, 5, 6, 5, 4, 3, 2, 2, 3, 4, 5, 3, 6, 2, 1, 1, 3, 2, 4, 4, 3, 6, 6, 4, 2, 2, 1, 6, 1, 5, 2, 2, 3, 1, 3, 6, 3, 3, 2, 3, 3, 3, 3, 1, 6, 4, 2, 1, 3, 2, 3, 2, 0, 1, 3, 6,
			2, 1, 4, 2, 3, 2, 2, 2, 0, 3, 2, 3, 4, 0, 3, 6, 2, 2, 4, 2, 6, 6, 4, 2, 3, 1, 3, 2, 2, 2, 6, 0, 2, 0 };

	// [primary expression] 0: NameReference, 1:FunctionApply, 2:Literal
	static final Integer[] PrimaryExpressionRatio = { 2, 1, 1, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 2, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 2, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0,
			1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 2, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 0, 2 };

	// [literal] 0:Boolean, 1:Null, 2:Integer, 3:String
	static final Integer[] OldLiteralRatio = { 2, 1, 3, 2, 0, 3, 0, 0, 0, 1, 0, 2, 2, 0, 1, 0, 0, 2, 0, 0, 0, 2, 1, 0, 0, 0, 1, 2, 0, 1, 2, 0, 3, 1, 0, 0, 1, 2, 1, 0, 3, 1, 0, 2, 1, 1, 3, 2, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 3, 2, 0, 2, 0, 1,
			1, 1, 1, 3, 0, 0, 0, 3, 0, 1, 1, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 1, 3, 2, 1, 1, 0, 1, 2, 0, 0 };

	// [literal] 0:Null, 1:Integer, 2:String, 3:False, 4:True
	static final Integer[] LiteralRatio = { 0, 0, 0, 0, 4, 0, 1, 0, 1, 2, 1, 4, 0, 3, 3, 0, 1, 1, 1, 1, 0, 3, 0, 3, 0, 3, 1, 2, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 1, 0, 1, 1, 1, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 4, 4, 0, 3, 0, 0, 0, 2, 0, 1, 0, 1, 2, 1, 1, 0,
			2, 0, 2, 0, 1, 1, 1, 2, 0, 1, 1, 0, 0, 1, 0, 4, 2, 0, 4, 4, 0, 0, 3, 0, 1, 3, 0, 1, 1, 0 };

	static final Boolean[] BooleanRatio = { true, true, false, false, false, false, true, false, false, false, true, true, true, false, false, true, false, false, false, true, true, false, false, true, true, false, true, true, true, false, true, false,
			true, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, false, false, false, false, true, false, false, true, false, false, true, false, true, true, false, true, false, true, true,
			true, false, false, false, true, false, false, false, false, true, false, false, true, false, false, false, true, true, false, false, false, false, true, true, true, false, false, false, true, true, true, true };

	static final Integer[] IntegerValueUpBounds = { 10, 1000, 100000, 100, 10000 };

	// [type] 0:Boolean, 1:Integer, 2:String, 3:Long
	static final Integer[] TypeRatio = { 2, 2, 2, 1, 2, 1, 0, 2, 2, 2, 3, 2, 1, 1, 1, 2, 2, 3, 1, 1, 2, 1, 1, 2, 2, 2, 2, 3, 2, 1, 1, 0, 1, 0, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 0, 1, 0, 2, 1, 1, 1, 2, 2, 1, 3, 2, 1, 3, 1, 3, 0, 2, 1, 2, 1, 2, 0, 1,
			1, 3, 2, 1, 2, 0, 1, 1, 1, 1, 2, 0, 0, 2, 1, 2, 3, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 0 };
}
