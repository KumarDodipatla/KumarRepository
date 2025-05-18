package package1;

public class Debugprac 
{  int deepak;
  public void m1()
  {
	  System.out.println("first line...");
	  System.out.println("second line....");
  }
  public void m2()
  {
	  System.out.println("third line...");
	  System.out.println("fourth line....");
  }
  public static void main(String[] args) 
  {    System.out.println("Main Method Start");
       System.out.println("Second line of main method...");
	   Debugprac ob = new Debugprac();
	   ob.m1();
	   ob.m2();
	   ob.deepak=11;
	   System.out.println("Global Variable "+ob.deepak);
	   System.out.println("End of Manin Method....");
	     }
}
