import java.util.Scanner;

public class Problem3 {
	
	public static double PrimeFactor(double value)
	{
		double primeFactor = value;
	//	boolean isPrime = true;
		double factor1 =0;
		double i = 2;
	    while(((i*i)<=primeFactor)&& (i>1))
		{
			if(value%i==0)
			{
				value = (value/i);
			 factor1 =i;
			}
			else
			{
				i++;
			}
		
			if(value>factor1)
			{
				factor1 = value;
			}
		}
		
		return factor1;
	}
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter the number whose prime factors to be displayed ");
		double value = in.nextDouble();
		double factor = PrimeFactor(value);
		System.out.println("the largest prime number is"+factor);
		return;
	}
}
