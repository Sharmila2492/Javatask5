package task5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name: ");
	String S=sc.nextLine();
	
	for(int i=S.length()-1;i>=0;i--)
	{
	System.out.print(S.charAt(i));	
	}

	}

}
/*Output:
	Enter the name: 
		SHARMILA
		ALIMRAHS*/
