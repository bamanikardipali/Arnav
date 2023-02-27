package Demo;

public class Super_This extends Super
{
	int a=20;
	public void m1()
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	public static void main(String[] args) 
	{
		Super_This S=new Super_This ();
		S.m1();
		
	}
}
