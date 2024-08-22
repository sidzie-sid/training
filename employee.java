package train;

import java.util.Scanner;

public class employee {
	public static void main(String[] args  )throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int a=s.nextInt();
		
		if(a%2==0)
		{ System.out.println("even no");
}
		else {
			System.out.println("odd no");
		}
}
}