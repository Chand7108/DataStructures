import java.util.*;

class InfixToPostfix
{
	static int precedence(char ch)
	{
		switch(ch)
		{
			case '+' : 
			case '-' : return 1;
			case '*' : 
			case '/' : return 2;
			case '^' : return 3;
		}
		return -1;
	}
	static String infixToPostfix(String in)
	{
		String result = new String("");
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < in.length();++i)
		{
			char c = in.charAt(i);
			if(Character.isLetterOrDigit(c))
				result+= c;
			else if(c == '(')
				stack.push(c);
			else if(c == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
					result+= stack.pop();
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else stack.pop();
			}
			else 
			{
				while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
					result+= stack.pop();
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
			result+= stack.pop();
		return result;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String infix = in.nextLine();
		System.out.println(infixToPostfix(infix));
	}
}