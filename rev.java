package train;

import java.util.Scanner;

public class rev {
	public static void main (String[] args)

{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no for rev ");
	int num=s.nextInt();
  //System.out.println(num);
  int rev=0;
 while(num!=0)
  {
  int rem= num%10;
  rev=rev*10+rem;
  num=num/10;
  }
  System.out.println(rev);
  
  
}
}
