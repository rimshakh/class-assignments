public class Method{
	public static int square(int n){
	return n * n;
	}
	public static int cube(int n){
	return n * n * n;
	}

	public static void main(String[] args){
		 
		int n = Integer.parseInt(args[0]);
		int result = square(n);
		int result1 = cube(n);

		System.out.println("Square of " + n + " is: " + result);
		System.out.println("Cube of " + n + " is: " + result1);
			 
	
	}
}
