package homework1_1;


public class homework1_1 {
	public static void main(String[] args) {
		while(true){
			System.out.println("Eneter integer: ");
			java.util.Scanner input = new java.util.Scanner(System.in);
			double integer = input.nextDouble();
			
			if (integer%5 == 0 && integer%6 == 0){
				System.out.println("The number is divisible by 5 and 6");
			}
			if (integer%5 == 0 || integer%6 == 0) {
				System.out.println("The number is divisible by 5 or 6");
			}
			if (integer%5 == 0 ^ integer%6 == 0)  {
				System.out.println("The number is divisible by 5 or 6 but not both");
			}
		}		
	}
}


