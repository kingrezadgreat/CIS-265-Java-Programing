package homework2_6;
import java.util.Scanner; 

public class homework2_6 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		String input_string = input.nextLine(); 
		
		long num = Long.parseLong(input_string);
		long sum = count(num);
		System.out.println("The sum of digits of ( " + input_string + " ) is ( " + sum + " )");
	}
	
	public static long count(long num){
		
		long rest = num/10;
		long remainder = num%10;
		if (rest == 0){
			return remainder;	
		}
		return remainder + count(rest);
	}
}
