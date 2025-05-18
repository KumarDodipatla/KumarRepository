package package5;
import package1.Automation;
public class WebAutomation extends Automation
{
public void method2()
{
	System.out.println("Method 2 in Child Class Method");
}
public static void main(String[] args) 
{
	WebAutomation web = new WebAutomation();
	web.method2();
	web.method1();
	web.kumar=22;
	System.out.println("Variable " + web.kumar);
}
}
