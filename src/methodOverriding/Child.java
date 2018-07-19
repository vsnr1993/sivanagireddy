package methodOverriding;

public class Child extends Parent {
	public void Sub()
	{
		System.out.println(10-5);
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.add();
		c.Sub();
	}

}
