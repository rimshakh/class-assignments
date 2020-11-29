import java.util.*;
public class IfStatement {
	public static void main(String[] args){
	 int age;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter Your Age ");  
		age = a.nextInt();
		if(age <= 35)
			{
			System.out.println("You are eligilbe to apply for this designation");
			}
		if(age > 35)
			{
			System.out.println("Sorry! You can't apply for this designation");
			}		 
	}
}

