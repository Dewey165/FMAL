import java.util.Scanner;

public class Lexer {
	
	Scanner scanner = new Scanner (System.in);
	
	boolean semicol = false;
		
	//String?Token?
	public Token nextToken()
	{
		String lexeme;
		if(semicol)
		{
			lexeme = ";";
			semicol = false;
		}
		else 
		{
			lexeme = scanner.next();
			char[] temp = lexeme.toCharArray();
			if( temp[lexeme.length()-1] == ';')
			{
				semicol = true;
				int length = lexeme.length() - 1;
				lexeme = lexeme.substring(0,length);
			}
		}
		
		Token tokenCode = new Token(lexeme);
		
		if(lexeme == "print")				{tokenCode.tCode = Token.TokenCode.PRINT;}
		else if(lexeme == "end")			{tokenCode.tCode =  Token.TokenCode.END;}
		else if(lexeme.matches("[A-Za-z]+")){tokenCode.tCode =  Token.TokenCode.ID;}
		else if(lexeme.matches("[0-9]+"))	{tokenCode.tCode =  Token.TokenCode.INT;}
		else if(lexeme == "=")				{tokenCode.tCode =  Token.TokenCode.ASSIGN;}
		else if(lexeme == ";")				{tokenCode.tCode =  Token.TokenCode.SEMICOL;}
		else if(lexeme == "+")				{tokenCode.tCode =  Token.TokenCode.ADD;}
		else if(lexeme == "-")				{tokenCode.tCode =  Token.TokenCode.SUB;}
		else if(lexeme == "*")				{tokenCode.tCode =  Token.TokenCode.MULT;}
		else if(lexeme == "(")				{tokenCode.tCode =  Token.TokenCode.LPAREN;}
		else if(lexeme == ")")				{tokenCode.tCode =  Token.TokenCode.RPAREN;}
		else 								{tokenCode.tCode =  tokenCode.tCode.ERROR;}
		
		return tokenCode;
	}
}