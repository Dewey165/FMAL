
public class Parser {
	Lexer lex; 
	Token token;
	
	public void parse() {
		// TODO Auto-generated constructor stub
		
		token = lex.nextToken();
		Statements();
		
	}
	
	private void Statements() {
		/*
 		if (token == END) {
 		break;
 		}
 		else {
 			Statement();
 			if (token == SEMICOL) {
 				token = lex.nextToken();
 				Statements();
 			}
 			else {
 				Error();
 			}
 		}
		*/
	}
	
	private void Statement() {
		/*
 		if (token == ID) {
 			token = lex.nextToken();
 			if (token == ASSIGN) {
 				token = lex.nextToken();
 				Expr();
 			}
 			else {
 				Error();
 			}
 		}
 		else if (token == PRINT) {
 			token = lex.nextToken();
 			if (token == ID) {
 				token = lex.nextToken();
 			}
 			else {
 				Error();
 			}
 		}
 		else {
 			Error();
 		}
		*/
	}
	
	private void Expr() {
		/*
		Term();
		if (token == ADD || token == SUB) {
			token = lex.nextToken();
			Expr();
		}
		*/
	}
	
	private void Term() {
		/*
 		Factor();
		if (token == MULT) {
			token = lex.nextToken();
			Term();
		}
		*/
	}
	
	private void Factor() {
		/*
 		if (token == INT) {
 			token = lex.nextToken();
 		}
 		else if (token == ID) {
 			token = lex.nextToken();
 		}
 		else if (token == LPAREN) {
 			token = lex.nextToken();
 			Expr();
 			token = lex.nextToken();
 			if (token == LPAREN) {
 				token = lex.nextToken();
 			}
 			else {
 				Error();
 			}
 		}
 		else {
 			Error();
 		}
		*/
	}
	
	private void Error() {
		/*
 		print "Syntax error!";
		*/
		
	}
}