
public class Parser {
	Lexer lex; 
	Token.TokenCode token;
	
	Parser(Lexer lex) {
		this.lex = lex;
	}
	
	public void parse() {
		// TODO Auto-generated constructor stub
		
		token = lex.nextToken();
		statements();
		
		
	}
	
	private void statements() {
 		if (token == Token.TokenCode.END) {
 		}
 		else {
 			statement();
 			if (token == Token.TokenCode.SEMICOL) {
 				token = lex.nextToken();
 				statements();
 			}
 			else {
 				error();
 			}
 		}
	}
	
	private void statement() {
 		if (token == Token.TokenCode.ID) {
 			token = lex.nextToken();
 			if (token == Token.TokenCode.ASSIGN) {
 				token = lex.nextToken();
 				expr();
 			}
 			else {
 				error();
 			}
 		}
 		else if (token == Token.TokenCode.PRINT) {
 			token = lex.nextToken();
 			if (token == Token.TokenCode.ID) {
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
		if (token == Token.TokenCode.ADD || token == Token.TokenCode.SUB) {
			token = lex.nextToken();
			expr();
		}
	}
	
	private void term() {
 		factor();
		if (token == Token.TokenCode.MULT) {
			token = lex.nextToken();
			term();
		}
	}
	
	private void factor() {
 		if (token == Token.TokenCode.INT) {
 			token = lex.nextToken();
 		}
 		else if (token == Token.TokenCode.ID) {
 			token = lex.nextToken();
 		}
 		else if (token == Token.TokenCode.LPAREN) {
 			token = lex.nextToken();
 			expr();
 			token = lex.nextToken();
 			if (token == Token.TokenCode.LPAREN) {
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