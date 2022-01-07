package basics;

public class MathOperations {

	public static void main(String[] args)
	{
		MathOperations m = new MathOperations();
		System.out.println("Output is:");
		m.opr1();
		m.opr2();
		m.opr3();
		m.opr4();
	}
	
	public void opr1()
	{
		int a=(-5)+8*6;
		System.out.println(a);
	}
	
	public void opr2()
	{
		int b= (55+9) % 9;
		System.out.println(b);
	}
	
	public void opr3()
	{
		int c=20 +(-3)*5 / 8;
		System.out.println(c);
	}
	
	public void opr4()
	{
		int d=5 + 15 / 3 * 2 - 8 % 3;   
        System.out.println(d);
	}
	
}
