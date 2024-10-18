package package1;

public class Assignment1 {
	
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
	
	public int mul (int e, int f)

	{
		int g;
		g= e*f;
		System.out.println("mul result is " + g);
		return g;
	}
		
	public void div (int r1, int r2)
	{
		int result;
		result= r1 / r2;
		System.out.println("Final result is "+ result);
	}
	
	public static void main(String[] args) 
	{
		Assignment1 ob = new Assignment1 ();
		int sumresult = ob.sum(10,2);
		int subresult = ob.subtract(sumresult, 2);
		int sumresult2 = ob.sum(subresult,2);
		int mul = ob.mul(sumresult2, 2);
		ob.div(mul, 2);
		System.out.println();
		
		Assignment1 ob1 = new Assignment1 ();
		int mulresult_1 = ob1.mul(10,2);
		int subresult_1 = ob1.subtract(mulresult_1, 2);
		int subresult_2 = ob1.subtract(subresult_1,2);
		int sumresult_1 = ob1.sum (subresult_2, 2);
		ob.div(sumresult_1 , 2);
		
			
	}

}
