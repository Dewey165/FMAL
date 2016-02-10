import java.util.*;


public class Interpreter {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		String operand, variable;
		int value;
		Stack<String> stack = new Stack<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String command = scanner.next();
			if (command.matches("PUSH")) {
				operand = scanner.next();
				if (map.containsKey(operand)) {
					stack.push(String.valueOf(map.get(operand)));
				}
				else {
					stack.push(operand);
				}
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
				map.put(variable, value);
			}
			else if (command.matches("PRINT")) {
				System.out.println(stack.pop());
			}
		}
	}
}
