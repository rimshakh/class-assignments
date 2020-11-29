import java.util.*;
public class IfElse {
	public static void main(String[] args){
	 int number;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a number ");  
		number = a.nextInt();
		 if( number%2 == 0 )
			{
			System.out.println("This number is Even");
			}
		else
			{
			System.out.println("This number is Odd");
			}		 
	}
}
