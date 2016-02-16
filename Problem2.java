//Find the sum of all the even-valued terms in the Fibonacci sequence
which do not exceed four million.

import java.util.*;
public class Problem2{
	
	static double inputLimit =0;
	static double sum = 0;
			static double evenSum = 0;
	
			public static void setMax(double size)
			{
				inputLimit = size;
			}	
		public static double fib(double n)
		{
			if(n==0)
			{
				return 1;
			}
			else if(n==1)
			{
				return 2;
			}
			else
				return fib(n-1)+fib(n-2);
		}
		public static double sumEvenOfFib()
		{	
			double i =0;
			while(fib(i)<inputLimit)
			{
				
				//sum = sum+fib(i);
				if(fib(i)%2==0)
				{
					System.out.println("value of fib(i) is"+fib(i));
					evenSum = evenSum+fib(i);
				}
				i++;
			}
			return evenSum;
		}
		@SuppressWarnings("null")
		public static void main(String args[])throws NullPointerException
		{
			
			int input;
			System.out.println("Enter limit of sum");
			Scanner in = new Scanner(System.in);
			input = in.nextInt();
			setMax(input);
			double even = sumEvenOfFib();
			System.out.println("Value of even sum is "+even);
			in.close();
			return;
		}
};