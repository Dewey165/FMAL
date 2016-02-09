
public class Token {
	String lexeme;
	public TokenCode tCode;
	
	enum TokenCode { ID, ASSIGN, SEMICOL, INT, ADD, MINUS,
		MULT, LPAREN, RPAREN, PRINT, END, ERROR }
	
	public TokenCode tCode (String lexeme)
	{
		if (lexeme.matches([A-Za-z]+)){return tCode[0];}
		else if(lexeme == '='){return tCode[1];}
		else if(lexeme == ';'){return tCode[2];}
		else if (lexeme.matches([0-9]+)){return tCode[3];}
		else if(lexeme == '+'){return tCode[4];}
		else if(lexeme == '-'){return tCode[5];}
		else if(lexeme == '*'){return tCode[6];}
		else if(lexeme == '('){return tCode[7];}
		else if(lexeme == ')'){return tCode[8];}
		else if(lexeme == 'print'){return tCode[9];}
		else if(lexeme == 'end'){return tCode[10];}
		else {return tCode[11];}
	}
}
