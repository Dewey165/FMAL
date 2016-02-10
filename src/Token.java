
public class Token {
	String lexeme;
	public TokenCode tCode;
	
	enum TokenCode { ID, ASSIGN, SEMICOL, INT, ADD, SUB,
		MULT, LPAREN, RPAREN, PRINT, END, ERROR }	
	
	public Token() {
		this.lexeme = lexeme;
		this.tCode = tCode;
	}
}
