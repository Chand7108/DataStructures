import java.util.*;

class PostfixEval
{
	static int postfixEval(String in)
	{
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < in.length(); i++)
		{
			char c = in.charAt(i);
			if(Character.isDigit(c))
				stack.push(c-'0');
			else
			{
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch(c)
				{
					 case '+' : stack.push(op1+op2);
					            break;
					 case '-' : stack.push(op2-op1);
					            break;
                     case '*' : stack.push(op1*op2);
					            break;
					 case '/' : stack.push(op2/op1);
					            break;
				}
			}

		}
		return stack.pop();
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String postfix = in.nextLine();
		System.out.print(postfixEval(postfix));
	}
}