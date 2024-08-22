package train;

import java.util.Scanner;

public class vovel {
	
 public static void main(String [] args)
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter the char");
	 char ch=s.next().charAt(0);
	 System.out.println(ch);
	 
	 if (ch == 'a'||'e'||'i'||'o'||'u')
	 {
		 System.out.println("its a vowel");
	 }
	 else
		 
	 { System.out.println("its a consonent");
	 
	 
 }
}
}