package train;

import java.util.Scanner;

public class clock {
	public static void main (String[] args)throws Exception
	{

	Scanner s=new Scanner(System.in);
	System.out.println("enter h , m and s");
	int hh=s.nextInt();
	int mm=s.nextInt();
	int ss=s.nextInt();
	System.out.println(hh+mm+ss);
	System.out.println("clock");
	{
for( hh=hh;hh<24;hh++)
{for(mm=mm;mm<60;mm++)
{for(ss=ss;ss<60;ss++)
	System.out.println(hh+":"+mm+":"+":"+ss+"\r");
Thread.sleep(1000);
}ss=0;
}mm=0;
	
}hh=0;
}}