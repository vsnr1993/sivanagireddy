package WindowHandles;

public class ReversingString {
	public void reverseString(String s)
	{
		String revString = "";
		for(int i=(s.length()-1); i >= 0; i--)
		{
			//revString.concat(Character.toString(s.charAt(i)));
			revString = revString + s.charAt(i);
		}
		if(revString.equals(s))
		{
			System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
	}
	public static void main(String[] args) {
		ReversingString rs = new ReversingString();
		rs.reverseString("123");
	}

}
