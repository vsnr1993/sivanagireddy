package WindowHandles;

public class MethodOverloadingExample {
	
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	public void add(int a, double b)
	{
		double d= a+b;
		System.out.println(d);
		
	}
	public void add(int a,int b,int c) {
		int d= a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		MethodOverloadingExample me= new MethodOverloadingExample();
		me.add(30, 40);
		me.add(20, 30.45);
		me.add(1, 2, 9);
	}
}
 