package Demo;

import java.util.Scanner;

public class Even_odd 
{
	public static void main(String[] args) 
	{
		int a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no: ");
		a=sc.nextInt();
		if (a%2==0) 
		{
			System.out.println("Given no is even");
		} 
		else 
		{
			System.out.println("Given no is odd");
		}
		
		
	}
}
