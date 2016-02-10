public class Compiler {
	
	public void main() {
		System.out.println("Hi!");
		Lexer myLexer = new Lexer();
		Parser myParser = new Parser(myLexer);
		myParser.parse();
	}	
}
