
public class Parser {
	Lexer lex; 
	Token token;
	
	Parser(Lexer lex) {
		this.lex = lex;
	}
	
	public void parse() {
		token = lex.nextToken();
		statements();
	}
	
	private void statements() {
 		if (token.tCode == Token.TokenCode.END) {
 		}
 		else {
 			statement();
 			if (token.tCode == Token.TokenCode.SEMICOL) {
 				token = lex.nextToken();
 				statements();
 			}
 			else {
 				error();
 			}
 		}
	}
	
	private void statement() {
 		if (token.tCode == Token.TokenCode.ID) {
 			token = lex.nextToken();
 			if (token.tCode == Token.TokenCode.ASSIGN) {
 				token = lex.nextToken();
 				expr();
 				System.out.println("ASSIGN");
 			}
 			else {
 				error();
 			}
 		}
 		else if (token.tCode == Token.TokenCode.PRINT) {
 			token = lex.nextToken();
 			System.out.println("PRINT");
 			if (token.tCode == Token.TokenCode.ID) {
 				token = lex.nextToken();
 			}
 			else {
 				error();
 			}
 		}
 		else {
 			error();
 		}
	}
	
	private void expr() {
		term();
		if (token.tCode == Token.TokenCode.ADD) {
			token = lex.nextToken();
			expr();
			System.out.println("ADD");
		}
		else if (token.tCode == Token.TokenCode.SUB) {
			token = lex.nextToken();
			expr();
			System.out.println("SUB");
		}
	}
	
	private void term() {
 		factor();
		if (token.tCode == Token.TokenCode.MULT) {
			token = lex.nextToken();
			term();
			System.out.println("MULT");
		}
	}
	
	private void factor() {
 		if (token.tCode == Token.TokenCode.INT) {
 			token = lex.nextToken();
 			System.out.println("INT");
 		}
 		else if (token.tCode == Token.TokenCode.ID) {
 			token = lex.nextToken();
 			System.out.println("ID");
 		}
 		else if (token.tCode == Token.TokenCode.LPAREN) {
 			token = lex.nextToken();
 			expr();
 			token = lex.nextToken();
 			if (token.tCode == Token.TokenCode.LPAREN) {
 				token = lex.nextToken();
 			}
 			else {
 				error();
 			}
 		}
 		else {
 			error();
 		}
	}
	
	private void error() {
		System.out.println("Syntax error!");
	}
}