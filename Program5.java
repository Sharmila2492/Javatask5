package task5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mark: ");
		int Mark= sc.nextInt();
		
		if(Mark==100) {
			System.out.println("S");
		}
			else if(Mark>=90 && Mark<=99)
			{
				System.out.println("A");
			}
			else if(Mark>=80 && Mark<=89)
			{
				System.out.println("B");
			}
			else if(Mark>=70 && Mark<=79)
			{
				System.out.println("C");
			}
			else if(Mark>=60 && Mark<=69)
			{
				System.out.println("D");
			}
			else if(Mark>=50 && Mark<=59)
			{
				System.out.println("E");
			}
			else if(Mark>=0 && Mark<50)
			{
				System.out.println("F");
			}
			else
			{
				System.out.println("Invalid Input");
		}
		
	}

}
/*Output:
	Enter the Mark: 
	50
	E
	Enter the Mark: 
    110
    Invalid Input
*/
	
