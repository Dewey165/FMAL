
public class Token {
	String lexeme;
	public TokenCode tCode;
	
	enum TokenCode { ID, ASSIGN, SEMICOL, INT, ADD, SUB,
		MULT, LPAREN, RPAREN, PRINT, END, ERROR }
		
	public static TokenCode deCode(String lexeme)
	{
	    this.lexeme = lexeme;
	    return getCode(lexeme);
	}
	
	public TokenCode getCode (String lexeme)
	{
		if (lexeme.matches("[A-Za-z]+")){return TokenCode.ID;}
		else if(lexeme == "="){return TokenCode.ASSIGN;}
		else if(lexeme == ";"){return TokenCode.SEMICOL;}
		else if (lexeme.matches("[0-9]+")){return TokenCode.INT;}
		else if(lexeme == "+"){return TokenCode.ADD;}
		else if(lexeme == "-"){return TokenCode.SUB;}
		else if(lexeme == "*"){return TokenCode.MULT;}
		else if(lexeme == "("){return TokenCode.LPAREN;}
		else if(lexeme == ")"){return TokenCode.RPAREN;}
		else if(lexeme == "print"){return TokenCode.PRINT;}
		else if(lexeme == "end"){return TokenCode.END;}
		else {return TokenCode.ERROR;}
	}
}
