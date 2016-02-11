import java.io.IOException;
import java.io.StreamTokenizer;
public class Lexer {
	
	@SuppressWarnings("deprecation")
	StreamTokenizer st = new StreamTokenizer(System.in);
	int minusNumber = 0;
	/*
	Scanner scanner = new Scanner (System.in);
	static boolean readIntoQueue = true;
	private static Queue<String> queue = new LinkedList<String>();
	*/
	public Token nextToken()
	{
		String lexeme;
		Token tokenCode = null;
		int tokenType;
		try {
			if (minusNumber != 0)
			{
				lexeme = "" + minusNumber; 
				tokenCode = new Token(lexeme);
				tokenCode.tCode =  Token.TokenCode.INT;
				minusNumber = 0;
				return tokenCode;
			}
			
			tokenType = st.nextToken();
			lexeme = st.toString();
			
			
			
			//tokenType == StreamTokenizer.TT_EOF;
			//tokenType = st.nextToken()) 
		
			switch(tokenType) {
				case StreamTokenizer.TT_NUMBER:
					double temp = st.nval;
					int temp1 = (int)Math.round(temp);
					if(temp1 < 0)
					{
						minusNumber = temp1 * (-1);
						tokenCode = new Token("-");
						tokenCode.tCode =  Token.TokenCode.SUB;
						break;
					}
					lexeme = "" + temp1; 
					tokenCode = new Token(lexeme);
					tokenCode.tCode =  Token.TokenCode.INT;
					break;
				case StreamTokenizer.TT_WORD:
					lexeme = st.sval;
					tokenCode = new Token(lexeme);
					//System.out.println("identifier " + st.sval);
					if(lexeme.matches("print"))
					{
						tokenCode.tCode = Token.TokenCode.PRINT;
					}
					else if(lexeme.matches("end"))
					{
						tokenCode.tCode =  Token.TokenCode.END;
					}
					else
					{
						tokenCode.tCode =  Token.TokenCode.ID;
					}
					break;
				default:
					lexeme = "" +(char)tokenType;
					tokenCode = new Token(lexeme);
					if((char)tokenType == '=')					{tokenCode.tCode =  Token.TokenCode.ASSIGN;}
					else if((char)tokenType == ';')				{tokenCode.tCode =  Token.TokenCode.SEMICOL;}
					else if((char)tokenType == '+')				{tokenCode.tCode =  Token.TokenCode.ADD;}
					else if((char)tokenType == '-')				{tokenCode.tCode =  Token.TokenCode.SUB;}
					else if((char)tokenType == '*')				{tokenCode.tCode =  Token.TokenCode.MULT;}
					else if((char)tokenType == '(')				{tokenCode.tCode =  Token.TokenCode.LPAREN;}
					else if((char)tokenType == ')')				{tokenCode.tCode =  Token.TokenCode.RPAREN;}
					else 										{tokenCode.tCode =  Token.TokenCode.ERROR;}
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tokenCode;
	}
		/*if(readIntoQueue)
		{
			readIntoQueue();
		}
		for(int i = 0; i < queue.size(); i++)
		{
			System.out.println(queue.poll());
		}
		

		lexeme = queue.poll();
		//char[] temp = lexeme.toCharArray();
		
		
		lexeme = st.nextToken().toString();
		char lexChar = lexeme.charAt(0);
		Token tokenCode = new Token(lexeme);
		
		if(lexeme == "print")				{tokenCode.tCode = Token.TokenCode.PRINT;}
		else if(lexeme == "end")			{tokenCode.tCode =  Token.TokenCode.END;}
		else if(lexeme.matches("[A-Za-z]+")){tokenCode.tCode =  Token.TokenCode.ID;}
		else if(lexeme.matches("[0-9]+"))	{tokenCode.tCode =  Token.TokenCode.INT;}
		else if(lexChar == '=')				{tokenCode.tCode =  Token.TokenCode.ASSIGN;}
		else if(lexChar == ';')				{tokenCode.tCode =  Token.TokenCode.SEMICOL;}
		else if(lexChar == '+')				{tokenCode.tCode =  Token.TokenCode.ADD;}
		else if(lexChar == '-')				{tokenCode.tCode =  Token.TokenCode.SUB;}
		else if(lexChar == '*')				{tokenCode.tCode =  Token.TokenCode.MULT;}
		else if(lexChar == '(')				{tokenCode.tCode =  Token.TokenCode.LPAREN;}
		else if(lexChar == ')')				{tokenCode.tCode =  Token.TokenCode.RPAREN;}
		else 								{tokenCode.tCode =  Token.TokenCode.ERROR;}
		
		return tokenCode;
	}
	*/
}
