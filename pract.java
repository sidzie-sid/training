package train;

import java.util.Scanner;

public class pract {
	

	public static void main(String[] args  )throws Exception
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	int day=s.nextInt();
	
	
	
	switch (day) {
	
		case 1: case 2: case 3: case 4:
			System.out.println("rainy");
			break;
			
		case 5:case 6: case 7: case 8:
			System.out.println("winter");
			break;
			
		case 9: case 10: case 11:
			System.out.println("summer");
			break;
			
			default:
				System.out.println("not a season");
		

}
	} 
}
