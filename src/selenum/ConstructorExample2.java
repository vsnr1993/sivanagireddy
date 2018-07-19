package selenum;

public class ConstructorExample2 {
	int a;
	String b;

	public ConstructorExample2(int x, String y) {
		a = x;
		b = y;
	}

	public static void main(String[] args) {
		ConstructorExample2 ce = new ConstructorExample2(1, "siva");
		System.out.println(ce.a);
		System.out.println(ce.b);

		ConstructorExample2 ce2 = new ConstructorExample2(2, "reddy");
		System.out.println(ce2.a);
		System.out.println(ce2.b);

		PalindromeNumber pn = new PalindromeNumber();
		pn.palindrome(121);
	}

}
