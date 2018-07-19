package WindowHandles;

public class ConstructorOverloadingExample {
	public ConstructorOverloadingExample()
	{
		System.out.println("Empty Arguments Constructor Called");
	}
	public ConstructorOverloadingExample(int a)
	{
		System.out.println("Single Argument Integer Constructor Called");
	}
	public ConstructorOverloadingExample(char x)
	{
		System.out.println("Single Argument Character Constructor Called");
	}
	public ConstructorOverloadingExample(int a,int b)
	{
		System.out.println("Double Argument Constructor Called");
	}

	public static void main(String[] args) {
		ConstructorOverloadingExample ce= new ConstructorOverloadingExample();
		ConstructorOverloadingExample ce1= new ConstructorOverloadingExample(10);
		ConstructorOverloadingExample ce2 = new ConstructorOverloadingExample('a');
		ConstructorOverloadingExample ce3 = new ConstructorOverloadingExample(20 , 30);
		
	}
}
