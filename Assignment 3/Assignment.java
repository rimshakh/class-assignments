
 
import java.util.*;
public class Assignment { 
	public static void main(String[] args) 
	{ 

		// Declaring variables 
		int a, b, c; 
        Scanner z = new Scanner(System.in);
		 

		// Assigning values
      System.out.print("Enter A- ");  
      a = z.nextInt();
      System.out.print("Enter B- "); 
      b = z.nextInt();
      c = a + b;
      int d = b * c / a;	 
		// Displaying the assigned values 
		System.out.println("C = " + c); 
	  System.out.println("D = " + d); 
		} 
} 