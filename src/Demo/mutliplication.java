package Demo;

import java.util.Scanner;

public class mutliplication
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 no.");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		for(int i=1;i<=num1;i++)
		{
			sum=sum+num2;
		}
		System.out.println("Multiplication: "+sum);
	}
}
