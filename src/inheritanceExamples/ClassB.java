package inheritanceExamples;

public class ClassB extends ClassA {

	public void Print2()
	{
		System.out.println("Print2 Method");
	}
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.print1();
		b.Print2();
	}
}
