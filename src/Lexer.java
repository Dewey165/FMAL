import java.util.Scanner;

public class Lexer {
	
	public void nextToken()
	{
		Scanner scanner = new Scanner (System.in);
        	String lexeme = scanner.next();
		//Eitthvað svona, en scanner virkar, spurning með að senda í tokenið..
		Token tCode = new Token.deCode(s);
        	System.out.println(tCode.tCode);
	}
}
