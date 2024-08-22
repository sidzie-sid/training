package train;




abstract class son1
{
	abstract void tell(int i);
	void show(int a,int b )
	{
		int m= a%b;
		System.out.println("div is "+m);
	}
	}
class mom extends son
{
	void tell(int i)
	{
		System.out.println("my age is "+i);
	}

}
public class day21 {
	public static void main(String[] args)
	{
	mom m = new mom();
	m.tell(44);
	//m.show(44, 55);
	}

}