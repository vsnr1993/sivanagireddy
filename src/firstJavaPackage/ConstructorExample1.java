package firstJavaPackage;

public class ConstructorExample1 {
	int a;
	double b;
	
	public ConstructorExample1 (int a,double b) {
		this.a=a;
		this.b=b;
		
	}
	public static void main(String[] args) {
		ConstructorExample1 x=new ConstructorExample1(30,11.11);
		System.out.println(x.a);
		System.out.println(x.b);
		
		
		ConstructorExample1 y=new ConstructorExample1(40,22.22);   
		System.out.println(y.a);
		System.out.println(y.b);
		
	}


}
