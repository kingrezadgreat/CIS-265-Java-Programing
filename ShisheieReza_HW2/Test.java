package homework2_4;

public class Test {
	public static void main(String[] args){
		System.out.println("Hi, ABC, good".matches("ABC "));  // see if the two strings match
		System.out.println("Hi, ABC, good".matches(".*ABC.*"));  //see if the second sting matches with anything in the first string
		System.out.println("A,B;C".replaceAll(",;","#"));  // replace string ",;" with "#". Well there is no ",;" string so the result is the same
		System.out.println("A,B;C".replaceAll("[,;]","#"));   //  replace string/character "," and ";" with "#". Now you can find them and replace
		
		String[] tokens = "A.B:C".split("[.:]");  // this part splits the String once "." is ":" is detected and then print with a space in between
		for (int i = 0; i < tokens.length; i++){
			System.out.print(tokens[i] + " ");
		}
	}
}
