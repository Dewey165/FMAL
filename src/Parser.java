
public class Parser {
	Lexer lex; 
	Token token;
	
	public void parse() {
		// TODO Auto-generated constructor stub
		/*
		token = lex.nextToken();
		Statements();
		/*
	}
	
	private void Statements() {
		/*
 		if (token == END) {
 		break;
 		}
 		else {
 			token = lex.nextToken();
 			Statement();
 			if (token == SEMICOL) {
 				token = lex.nextToken();
 				Statements();
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
 		}
 		else if (token == PRINT) {
 			token = lex.nextToken();
 			if (token == ASSIGN) {
 			
 		}
		*/
	}
	
	private void Expr() {
		/*
 		
		*/
	}
	
	private void Term() {
		/*
 		
		*/
	}
	
	private void Factor() {
		/*
 		
		*/
	}
	
	private void Error() {
		/*
 		print "Syntax error!";
		*/
		
	}
}