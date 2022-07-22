import java.util.*;
import java.lang.Math;
public class Lab04MPU {

	
	
	public static void main(String[] args) {
		
		Stack<String> myStack = new Stack<>();
		Stack<Double> tempStack = new Stack<>();
		String ops = "+, -, *, /, ^, Sqrt, Recip, plusMinus";
		String input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the RPN Calculator");
		System.out.println("Author: Mark Unger");
		System.out.print("Enter a string of data, seperated by commas: ");
		
		input = scan.nextLine();
		
		System.out.println("You entered: " + input);
		StringTokenizer st = new StringTokenizer(input, ", ");
		while(st.hasMoreTokens())
		{
		myStack.add(st.nextToken());
		}
		
		
		
		
	
			
		try
		{
			
		
		for(int i = 0; i < myStack.size(); i++)
		{
			if(!ops.contains(myStack.get(i)))
					{
				tempStack.add(Double.parseDouble(myStack.get(i)));
					}
			else
			{
				if(myStack.get(i).equals("+"))
				{
					double secondTerm = tempStack.pop();
					double firstTerm = tempStack.pop();
					tempStack.push(firstTerm + secondTerm);
					
				}
				
				else if(myStack.get(i).equals("-"))
				{
					double secondTerm = tempStack.pop();
					double firstTerm = tempStack.pop();
					tempStack.push(firstTerm - secondTerm);
				}
				
				else if(myStack.get(i).equals("*"))
				{
					double secondTerm = tempStack.pop();
					double firstTerm = tempStack.pop();
					tempStack.push(firstTerm * secondTerm);
				}
				
				else if(myStack.get(i).equals("/"))
				{
					double secondTerm = tempStack.pop();
					double firstTerm = tempStack.pop();
					tempStack.push(firstTerm / secondTerm);
				}
				
				else if(myStack.get(i).equals("^"))
				{
					double secondTerm = tempStack.pop();
					double firstTerm = tempStack.pop();
					tempStack.push(Math.pow(firstTerm, secondTerm));
				}
				
				else if(myStack.get(i).equals("Sqrt"))
				{
					
					double firstTerm = tempStack.pop();
					tempStack.push(Math.sqrt(firstTerm));
				}
				
				else if(myStack.get(i).equals("Recip"))
				{
					
					double firstTerm = tempStack.pop();
					tempStack.push(1/ firstTerm);
				}
				
				else if(myStack.get(i).equals("plusMinus"))
				{
					
					double firstTerm = tempStack.pop();
					tempStack.push((-1) * firstTerm);
				}
			}
	}
		
	
		if(tempStack.size() == 1)
		{
			System.out.println("The answer is: " + tempStack.peek());

		}
		else
		{
			System.out.println("There are too many elements left on the stack, please try again.");
		}
		}
		catch(Exception e) 
		{
			System.out.println("You entered the stack wrong, please try again.");
		}
	}
		
}
