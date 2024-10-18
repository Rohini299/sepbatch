package package1;

public class Arthmatics {
	
	public int sum (int a, int b)
	{
	int c;
	c = a+b;
	System.out.println("sum of result " + c);
	return c;
	}
	
	public int subtract (int c, int d)

	{
		int e;
		e= c-d;
		System.out.println("sub result is " + e);
		return e;
	}
		
	public void multi (int r1, int r2)
	{
		int result;
		result= r1 * r2;
		System.out.println("Final result is "+ result);
	}
	
	public static void main(String[] args) 
	{
		Arthmatics ob = new Arthmatics ();
		int sumresult = ob.sum(10,2);
		int subresult = ob.subtract(8, 2);
		ob.multi(sumresult, subresult);
		
		
	}
}
