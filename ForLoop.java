import java.util.*;
public class ForLoop {
	public static void main(String[] args){
		int tab, len, c;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a number for table ");
		tab = a.nextInt();
		System.out.print("Enter length of the table ");
		len = a.nextInt();			
		for (c=1; c<=len; c++)
		{
			System.out.println(+ tab + " * " + c + " = " + tab*c );
		}		 
	}
}