package homework2_5;
import java.util.Scanner; 

public class homework2_5 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a String: ");
		String input_string = input.nextLine(); 
		
		System.out.println("Enter a charachter to find: ");
		char input_char = input.next().charAt(0); 
		
		int result = count(input_string,input_char,input_string.length()-1);
		System.out.println("The number of occurance of ( " + input_char + " ) in ( " +input_string + " ) is ( " + result+ " ) times" );
	}
	
	public static int count(String input_string, char input_char, int n ){
		int counter = 0;
		if (n<0){
			return 0;	
		}
		if (input_string.charAt(n)==input_char){
			counter = 1;
		}
		return counter+count(input_string,input_char,n-1);
	}
}