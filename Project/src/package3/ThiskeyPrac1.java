package package3;

public class ThiskeyPrac1 
{
	public ThiskeyPrac1()
	{   this(11,22,33);		
		System.out.println("Default Parameterized Constructor");
	}
	public ThiskeyPrac1(int a)
	{   this();
		System.out.println("One Parameterized Constructor");
	}
	public ThiskeyPrac1(int a,int b)
	{    this(11,22,33,44);
		System.out.println("Two Parameterized Constructor");
	}
	public ThiskeyPrac1(int a,int b,int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	public ThiskeyPrac1(int a,int b,int c,int d)
	{   this(11);
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		ThiskeyPrac1 ob = new ThiskeyPrac1(11,22);
	}
}
