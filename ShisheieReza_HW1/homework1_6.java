package homework1_6;
import java.util.Scanner;
public class homework1_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean error = true;
		System.out.println("The guideline for passwords is as follows: ");
		System.out.println("1. Minimum of 8 characters ");
		System.out.println("2. Only LETTERS and DIGITS  ");
		System.out.println("3. At least TWO digits ");
		while (error == true){
			error = false;  // turn off error
			
			System.out.println("Please enter your password: ");
			String input_string = input.next();
			
			char arr[]=input_string.toCharArray(); // take string input
			
			// CHECK THE LENGTH
			boolean length_pass = false;
			int pass_len = arr.length;
			if ( pass_len > 7)
				length_pass = true;
				
			
			// CHECK FOR DIGITS AND LETTERS AND OTHER
			boolean digit_pass = false;
			boolean letter_pass = false;
			boolean DigitChar_fail = false;
			
			for (int i=0; i<arr.length; i++){
				int x = (int)arr[i];
				
				if ( x>=48 && x<=57 ){
					digit_pass = true;
				
				} else if (( x>=65 && x<=90 ) || ( x>=97 && x<=122 )) {
					letter_pass = true;
					
				} else {
					DigitChar_fail = true;
				}
			}
			
			// CHECK FOR TWO DIGITS
			boolean twoDigit_pass = false;
			int digit_count = 0;
			for (int i=0; i<arr.length; i++){
				int x = (int)arr[i];
				if (x>=48 && x<=57)
					digit_count++;
			}
			if (digit_count > 1)
				twoDigit_pass = true;
			
			// ERRORS
	 
			if (length_pass == false){
				System.out.println("Please put AT LEAST 8 CHARACHERS in your password!");
				error = true;
			}
			if (digit_pass == false){
				System.out.println("Please put DIGITS in your password!");
				error = true;
			}
			if (letter_pass == false){
				System.out.println("Please put LETTERS in your password!");
				error = true;
			}
			if (DigitChar_fail == true){
				System.out.println("Please only put ONLY DIGITS and LETTERS in your password!");
				error = true;
			}
			if (twoDigit_pass == false){
				System.out.println("Please put AT LEAST 2 DIGITS in your password!");
				error = true;
			}
			System.out.println("");

		}
		System.out.println("Password passed!");

	}
}


