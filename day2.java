package train;

public class day2 {
	
public static void main(String[] args)
{
	son s=new son();
	dad d=new dad();
	d.tell(22,33);
	s.tell(11);
}
}
class dad{
	void tell(int a, int b)
	{
		int j=a+b;
	System.out.println("sum is "+ j );
	}
}
class son extends dad{
	void tell(int i)
	{
		super.tell(2,4);
		System.out.println("my age is "+i);
		
	}
}