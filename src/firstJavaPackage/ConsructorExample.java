package firstJavaPackage;

public class ConsructorExample {
	
	
	int a;
	char b;
	public ConsructorExample(int x, char y) {
		
	a=x;
    b=y;
	}

	public static void main(String[] args) {

		ConsructorExample obj=new ConsructorExample(10,'a');
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		ConsructorExample obj1=new ConsructorExample(20,'b');
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
	

}
