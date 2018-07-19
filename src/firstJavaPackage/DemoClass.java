package firstJavaPackage;

public class DemoClass {
	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		d.addWithoutReturning();
		int x=d.addWithReturnType(50, 50);
		System.out.println(x);
	}
public void addWithoutReturning()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
			
}
public int addWithReturnType(int a, int b)
{
 int result = a+b;
 return result;
}
}
