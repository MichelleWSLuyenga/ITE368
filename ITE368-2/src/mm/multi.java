package mm;

public class multi {

	int a, b;
	String str = "Junit is working fine";
	
	multi(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int mm()
	{
		return a*b;
	}
	public int mm1()
	{
		return a/b;
	}
	public int mm2()
	{
		return a+b;
	}
	public int mm3()
	{
		return a-b;
	}
	
	public String mm4()
	{
		return str;
	}
}
