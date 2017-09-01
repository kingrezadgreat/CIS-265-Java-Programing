package homework1_7;
import java.util.Scanner;

public class homework1_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number = 0;
		do{
			sum += number;					
			System.out.println("Enter an integer " + "(the input ends if it is 0)");
			number = input.nextInt();
		} while(number != 0 );
		System.out.println("The sum is " + sum);
	}
}
