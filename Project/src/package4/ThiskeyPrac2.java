package package4;

public class ThiskeyPrac2 
{
  public ThiskeyPrac2()
  {   this(11,22);
	  System.out.println("Default Parameterized Constructor");
  }
  public ThiskeyPrac2(int a)
  {   this(11,22,33,44);
	  System.out.println("One Parameterized Constructor");
  }
  public ThiskeyPrac2(int a,int b)
  {
	  System.out.println("Two Parameterized Constructor");
  }
  public ThiskeyPrac2(int a,int b,int c)
  {   this(11);
	  System.out.println("Three Parameterized Constructor");
  }
  public ThiskeyPrac2(int a,int b,int c,int d)
  {   this();
	  System.out.println("Four Parameterized Constructor");
  }
  public static void main(String[] args) 
  {
	  ThiskeyPrac2 ob=new ThiskeyPrac2(11,22,33);
  }
}
