package homework1_3;

public class homework1_3 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int matrix_size;
		do{
			System.out.println("Eneter the size of matrix: ");
			matrix_size = input.nextInt();
		} while (matrix_size <= 0);
		
		printMatrix (matrix_size);
		
	}
	
	public static void printMatrix (int n){
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i<n; i++){
			for (int j = 0; j<n; j++){
				if ( Math.random() < 0.5 ){
					matrix[i][j] = 0;
					System.out.print(matrix[i][j] + " ");
				} else {
					matrix[i][j] = 1;
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
