package task5;

public class Program6 {

	public static void main(String[] args) {
		    int month=4;
			System.out.println(month);
			float roomrent=2000;			
			System.out.println(roomrent);
			int days=3;
			System.out.println(days);
			if(month<=3)
			{
				System.out.printf("%.2f",roomrent*days);
			}
			else if (month>3 && month<=6)
			{
				System.out.printf("%.2f",roomrent*0.2*days);
			}
			else if(month>6 && month<=10)
			{
				System.out.printf("%.2f",roomrent*days);
			}
			else 
			{
				System.out.printf("%.2f",roomrent*0.2*days);
					
			}
			}
		    
	}
/*Output:
4
2000.0
3
1200.00*/
