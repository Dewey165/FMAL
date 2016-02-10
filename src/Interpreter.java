import java.util.*;


public class Interpreter {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		String operand, variable;
		int value;
		Stack<String> stack = new Stack<String>();
		scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String command = scanner.next();
			if (command.matches("PUSH")) {
				operand = scanner.next();
				stack.push(operand);
			}
			else if (command.matches("ADD")) {
				value = 0;
				value += Integer.parseInt(stack.pop());
				value += Integer.parseInt(stack.pop());
				stack.push(String.valueOf(value));
			}
			else if (command.matches("SUB")) {
				value = 0;
				value += -Integer.parseInt(stack.pop());
				value += Integer.parseInt(stack.pop());
				stack.push(String.valueOf(value));
			}
			else if (command.matches("MULT")) {
				value = 0;
				value += Integer.parseInt(stack.pop());
				value *= Integer.parseInt(stack.pop());
				stack.push(String.valueOf(value));
			}
			else if (command.matches("ASSIGN")) {
				value = Integer.parseInt(stack.pop());
				variable = (stack.pop());
				operand = (variable + ' ' + String.valueOf(value));
				stack.push(operand);
			}
			else if (command.matches("PRINT")) {
				System.out.println(stack.pop());
			}
		}
	}
}
