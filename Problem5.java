//What is the smallest number divisible by each of the numbers 1 to 20
import java.util.Scanner;

public class Problem5 {
	public static double gcd(double a,double b)
	{	
		double a1,b1 ;
		a1=a;b1=b;
		
		if(b==0)
		{
			//System.out.println("\n GCD of "+a1+" and "+b1+" is"+b);
			return a;
		}
		else if(b>a)
			return gcd(b,a);
			
		else
		{	
			return gcd(b,a%b);
		}
		
	}
	
	public static double LCM(double a,double b)
	{
		double gcd=0,lcm =0;
		gcd = gcd(a,b);
		lcm = (a*b)/gcd;
		//System.out.println("\n GCD of "+a+" and "+b+" is "+gcd);
		//System.out.println("\n LCM of "+a+" and "+b+" is "+lcm);
		return lcm;
	}
	public static void main(String []args)
	{
		double lcm,sub=0;
		int n,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nth number of the naatural number sequence where lcm of the sequence is to be found out");
		
		n = in.nextInt();
		double array[]= new double[n];
		for(i=1;i<n;i++)
		{
			array[i]= i;
		}
		sub = LCM(array[1],array[2]);
		for(i=3;i<n;i++)
		{	
			lcm = LCM(array[i],sub);
			sub = lcm;
		}
		System.out.println("The lcm of n consecutive numbers is "+sub);
		
		return ;	
	}

}
