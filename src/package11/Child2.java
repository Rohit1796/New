package package11;

public class Child2 extends Abstraction 
{

	@Override
	public void Method1()
	{
		 System.out.println("hii method1");
		
	}
	public static void main(String[] args)
	{ 
		Child2 b=new Child2();
		b.Method1();
}
}
