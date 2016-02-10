import java.util.Scanner;

public class Lexer {
	Scanner scanner = new Scanner (System.in);
	String lexeme = scanner.next();
	
	Token tokenCode = new Token(lexeme);
	
	//String?Token?
	public Token.TokenCode nextToken()
	{
		if     (lexeme.matches("[A-Za-z]+")){return tokenCode.tCode.ID;}
		else if(lexeme.matches("[0-9]+"))	{return tokenCode.tCode.INT;}
		else if(lexeme == "=")				{return tokenCode.tCode.ASSIGN;}
		else if(lexeme == ";")				{return tokenCode.tCode.SEMICOL;}
		else if(lexeme == "+")				{return tokenCode.tCode.ADD;}
		else if(lexeme == "-")				{return tokenCode.tCode.SUB;}
		else if(lexeme == "*")				{return tokenCode.tCode.MULT;}
		else if(lexeme == "(")				{return tokenCode.tCode.LPAREN;}
		else if(lexeme == ")")				{return tokenCode.tCode.RPAREN;}
		else if(lexeme == "print")			{return tokenCode.tCode.PRINT;}
		else if(lexeme == "end")			{return tokenCode.tCode.END;}
		else 								{return tokenCode.tCode.ERROR;}
	}
}