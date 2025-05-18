package package5;

public class SeleniumAutomation extends WebAutomation
{
	public void method3()
	{
		System.err.println("Child Method ");
	}
	public static void main(String[] args) 
	{
		SeleniumAutomation s = new SeleniumAutomation();
		s.method1();
		s.method2();
		s.method3();
		s.kumar=22;
	System.out.println("");		
	}
}
