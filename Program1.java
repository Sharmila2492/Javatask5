package task5;

public class Program1 {

	public static void main(String[] args) {
		String S="MADAM";
		String rev="";
		for(int i=S.length()-1;i>=0;i--)
		{
		   rev =rev+ S.charAt(i);	
		}
		if(S.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}
/*Output:
	It is palindrome*/
	
