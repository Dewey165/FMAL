
public class Token {
	String lexeme;
	TokenCode tCode;
	
	enum TokenCode { ID, ASSIGN, SEMICOL, INT, ADD, MINUS,
		MULT, LPAREN, RPAREN, PRINT, END, ERROR }
	
	void main()
	{
		lex();
	}
	int lex()
	{
		System.out.println("ble");
		return 0;
	}
}
