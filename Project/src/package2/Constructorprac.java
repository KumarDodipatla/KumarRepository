package package2;

public class Constructorprac 
{
 public Constructorprac()
 {
	 System.out.println("Default Parameterized Constructor");
 }
 
 public Constructorprac(int a)
 {
	 System.out.println("One Parameterized Constructor");
 }
 public Constructorprac(int a,int b)
 {
	 System.out.println("Two Parameterized Constructor");
 }
 public Constructorprac(int a,int b,int c)
 {
	 System.out.println("Three Parameterized Constructor");
 }
 public Constructorprac(int a,int b,int c,int d)
 {
	 System.out.println("Four Parameterized Constructor");
 }
 public static void main(String[] args) 
 {
	 Constructorprac ob = new Constructorprac();
	 Constructorprac ob1 = new Constructorprac(11,22);
	 Constructorprac ob3 = new Constructorprac(11,22,33);
	 Constructorprac ob4 = new Constructorprac(11,22,33,44);
}
}
