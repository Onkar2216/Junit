package junit;

public class JunitCode 
{
	static JunitCode sum=null;
	private JunitCode()
	{
		
	}
	public static synchronized JunitCode createInstance()
	{
		if(sum==null)
		{
			sum=new JunitCode();
		}
		return sum;
	}
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
}
