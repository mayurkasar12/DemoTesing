package app;

public class Calculator {
	public int add(int i, int j)
	{
		return i+j;
	}
	public int multiply(int i,int j)
	{
		return i*j;
	}
	public int division(int i,int j)
	{
		return i/j;
	}
	public int substract(int i,int j)
	{
		if(i>j)
			return i-j;
			else
				return j-i;
	}
}
