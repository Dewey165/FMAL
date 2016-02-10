
public class Compiler {
	
	public void main() {
		Lexer myLexer = new Lexer();
		Parser myParser = new Parser(myLexer);
		myParser.parse();
	}	
}
