package homework2_2;

import java.util.*;

public class homework2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter matric 1: ");
	    String input1 = input.nextLine();
	    System.out.print("Enter matric 2: ");
	    String input2 = input.nextLine();
	    
	    size_check(stringSize(input1), stringSize(input2));
	    	    
	    double[][] MAT_1 = strinToMatrix(input1);
	    double[][] MAT_2 = strinToMatrix(input2);
	    double[][] multi = mat_multiply (MAT_1, MAT_2);
	    
	    System.out.println("The products of Matric#1: ");
	    print_mat(MAT_1);
	    System.out.println("And Matric#2: ");
	    print_mat(MAT_2);
	    System.out.println("is: ");
	    print_mat(multi);
    }
	
	public static int stringSize (String input){
		String[] inputString = input.split(" ");
		return inputString.length;
	}
	
	public static void size_check (int MAT1_size, int MAT2_size){
		if (MAT1_size != MAT2_size){
			System.out.println(" Matrix size do not match");
			}
		if ((int) Math.sqrt(MAT1_size) != Math.sqrt(MAT2_size)){
			System.out.println(" Matrix 1 not square");
			}
		if ((int) Math.sqrt(MAT1_size) != Math.sqrt(MAT2_size)){
			System.out.println(" Matrix 2 not square");
			}
	}
		
	
	
	public static double[][] strinToMatrix (String input){
	    
		String[] inputString = input.split(" ");
	    double[] matric = new double[inputString.length];
	    for (int i=0; i<inputString.length; i++){
	    	matric[i] = Double.parseDouble(inputString[i]);
	    }
	    
	    int N = (int)Math.sqrt(matric.length);
		double[][] result = new double[N][N];
		int counter = 0;
		for (int i=0; i<N; i++){
			for (int ii=0; ii<N; ii++){
				result[i][ii] = matric[counter];
				counter++;
			}
		}
		return result;
	}

	public static void print_mat (double[][] MAT){
		for (int i=0; i<MAT.length;i++){
	    	for (int ii=0; ii<MAT.length;ii++){
			    System.out.print(MAT[i][ii]+ ", ");
	    	}
	    	System.out.println(" ");
	    }  
	}
		
	public static double[][] mat_multiply (double[][] MAT_1, double[][] MAT_2){
		int N = MAT_1.length;
		double[][] result = new double[N][N];
		for (int row=0; row<N; row++ ){
			for (int column=0; column<N; column++ ){
				double sum = 0;
				for (int i=0; i<N; i++){
					sum = sum + MAT_1[row][i]*MAT_2[i][column];
				}
				result [row][column] = sum;
			}
		}
		return result;
	}
}
