public class ReturnType{
	public static int cal(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	
	public static int cal2(int a, int b)
	{
		int sub = a - b;
		return sub;
	}
	
	public static int cal3(int a, int b)
	{
		int mul = a * b;
		return mul;
	}
	
	public static int cal4(int a, int b)
	{
		int div = a / b;
		return div;
	}
	
	public static void main(String[] args){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int result1 = cal(a, b);
	int result2 = cal2(a, b);
	int result3 = cal3(a, b);
	int result4 = cal4(a, b);
	System.out.println(+ a + " + " + b + " = " + result1);
	System.out.println(+ a + " - " + b + " = "  + result2);
	System.out.println(+ a + " * " + b + " = " + result3);
	System.out.println(+ a + " / " + b + " = " + result4);
	}
	
}