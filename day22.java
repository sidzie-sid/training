package train;

interface i1
{
	void show();
}
class i2 implements i1
{
	public void show()
	{
	 System.out.println("i am  a class");
	}
	}


public class day22 {
	
	public static void main (String[] args )
	{
	i2 i = new i2();
	i.show();
	
	}

}
