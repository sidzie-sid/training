package train;

import java.util.Scanner;

public class day3 {
public static void main (String[] args)
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no for table ");
	int num=s.nextInt();
	
	Scanner n=new Scanner(System.in);
	System.out.println("enter limit ");
	int lim=n.nextInt();
	
	for (int i = 1;i<=lim ;i++)
	{
		System.out.println(num*i);
	}
	}
}
