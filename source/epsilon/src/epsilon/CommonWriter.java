package src.epsilon;

package nez.tool;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

public abstract class CommonWriter {
	protected String fileName = null;
	boolean firstLine = true;
	private PrintStream out;

	public CommonWriter() {
		this.out = System.out;
		this.firstLine = true;
	}

	public void open(String path) throws IOException {
		close();
		if (path != null) {
			this.out = new PrintStream(new FileOutputStream(path));
		} else {
			this.out = System.out;
		}
		this.firstLine = true;
	}

	public void setPath(String path) {

	}

	public final void print(String text) {
		out.print(text);
		this.firstLine = false;
	}

	public final void printf(String fmt, Object... args) {
		out.printf(fmt, args);
		this.firstLine = false;
	}

	public final void flush() {
		out.flush();
	}

	public final void close() {
		L();
		if (out != System.out) {
			out.close();
		}
	}

	private HashMap<String, String> symMap = new HashMap<>();

	protected final String Symbol(String key) {
		return _symbol(key, key);
	}

	protected final String _symbol(String key, String def) {
		String s = symMap.get(key);
		return (s == null) ? def : s;
	}

	public final void setSymbol(String key, String s) {
		symMap.put(key, s);
	}

	protected int IndentLevel = 0;
	String currentIndentString = "";

	public final void incIndent() {
		this.IndentLevel = this.IndentLevel + 1;
		this.currentIndentString = null;
	}

	public final void decIndent() {
		this.IndentLevel = this.IndentLevel - 1;
		assert (this.IndentLevel >= 0);
		this.currentIndentString = null;
	}

	private final String _indent() {
		String tab = _symbol("\t", "   ");
		if (this.currentIndentString == null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < this.IndentLevel; ++i) {
				sb.append(tab);
			}
			this.currentIndentString = sb.toString();
		}
		return this.currentIndentString;
	}

	public final void L() {
		if (this.firstLine) {
			this.firstLine = false;
			return;
		}
		out.println();
	}

	public final void L(Object text) {
		L();
		print(_indent());
		print(text.toString());
	}

	public final void L(String fmt, Object... args) {
		L();
		print(_indent());
		printf(fmt, args);
	}

	public final void _L(Object text) {
		print(text.toString());
	}

	public final void _L(String fmt, Object... args) {
		printf(fmt, args);
	}

	public final void Begin() {
		Begin(Symbol("{"));
	}

	public final void Begin(String s) {
		print(s);
		this.incIndent();
	}

	public final void End() {
		End(Symbol("}"));
	}

	public final void End(String s) {
		this.decIndent();
		if (!(s == null || s.length() == 0)) {
			L(s);
		}
	}

	public void Comment(String fmt, Object... args) {

	}

	public void Verbose(String fmt, Object... args) {
		Comment(fmt, args);
	}

	// public final void writeIndent(String fmt, Object... args) {
	// writeIndent(String.format(fmt, args));
	// }
	//
	// public void writeMultiLine(String sub) {
	// int start = 0;
	// boolean empty = true;
	// for (int i = 0; i < sub.length(); i++) {
	// char ch = sub.charAt(i);
	// if (ch == ' ' || ch == '\t') {
	// continue;
	// }
	// if (ch == '\n') {
	// if (!empty) {
	// this.writeIndent(sub.substring(start, i));
	// }
	// start = i + 1;
	// empty = true;
	// continue;
	// }
	// empty = false;
	// }
	// }

}
