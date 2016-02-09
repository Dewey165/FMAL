
public class Parser {
	Lexer var1; 
	Token var2;
	
	public Parser(Lexer myLexer) {
		// TODO Auto-generated constructor stub
	}

	public void parse()
	{
		
	}
}


enum TokenCode { LPAREN, RPAREN, INT, PLUS, MINUS};
TokenCode nextToken;
void parser() {
	nextToken = lex();
	P();
}
void P() {
	if (nextToken == LPAREN) {
		nextToken = lex();
		Expr();
		if (nextToken == RPAREN)
			nextToken = lex();
			else error();
		}
		else {
			if (nextToken == int)
			nextToken = lex();
			else error();
		}
	}
	void Expr() {
		Oper();
		P();
		P();
	}
	void Oper() {
	if (nextToken == PLUS)
	nextToken = lex();
	else if (nextToken == MINUS)
	nextToken = lex();
	else error();
}