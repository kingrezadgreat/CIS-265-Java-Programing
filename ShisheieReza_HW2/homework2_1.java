package homework2_1;

import java.util.Arrays;

public class homework2_1 {
	
	int [][] employee_sum = new int[2][]; 
	public static void main(String[] args){
		int[][] hours = new int[][]{
			  { 2, 4, 3, 4, 5, 8, 8 },
			  { 7, 3, 4, 3, 3, 4, 4 },
			  { 3, 3, 4, 3, 3, 2, 2 },
			  { 9, 3, 4, 7, 3, 4, 1 },
			  { 3, 5, 4, 3, 6, 3, 8 },
			  { 3, 4, 4, 6, 3, 4, 4 },
			  { 3, 7, 4, 8, 3, 8, 4 },
			  { 6, 3, 5, 9, 2, 7, 9 }
			};
			
		int [][] sum_hours = emp_sum(hours);
		int [][] employee_sort = emp_sort(sum_hours);
		print_hours(employee_sort);
		
	}
	
	public static int[][] emp_sum (int[][] hours){
		
		int[][] sum_hours = new int [2][hours.length];
		
		for (int i=0; i<hours.length; i++){
			int sum = 0;
			for (int ii=0; ii<hours[0].length; ii++){
				sum = sum + hours[i][ii];
			}
			sum_hours [0][i] = sum;
			sum_hours [1][i] = i;	
		}
		return sum_hours;
	}
	
	public static int[][] emp_sort(int[][] array) {
	    
	    int step = array[0].length;
	    int temp_max = array[0][0];
	    int temp_emp = array[1][0];
	    int temp_pos = 0; 
	    
	    while(step>1){
	    	temp_max = array[0][0];
		    temp_emp = array[1][0];
		    temp_pos = 0; 
	    	
	    	for (int i=1; i<step; i++){
	    		if (array[0][i] > temp_max){
	    			temp_max = array[0][i];
	    		    temp_emp = array[1][i];
	    		    temp_pos = i; 
	    		}   		
	    	}
	    	array[0][temp_pos] = array[0][step-1];
    		array[1][temp_pos] = array[1][step-1];
    		
    		array[0][step-1] = temp_max;
    		array[1][step-1] = temp_emp;
    		
    		step--;
	    }
		/*
	    if (n == 0) // Base case
	      return array;
	    for (int count = n; count>0; count--){
	    	if (array[0][n-1]>temp_max){
	    		temp_max = array[0][n-1];
	    		temp_emp = array[1][n-1];
	    		temp_pos = count;
	    	}
	    }
	    int temp1 = array[0][n];
	    int temp2 = array[1][n];
	    
	    array[0][n] = temp_max; 
	    array[1][n] = temp_emp;
	    
	    array[0][temp_pos] = temp1; 
	    array[1][temp_pos] = temp2;
	    */
	    return array; // Recursive call
	  }
	
	public static void print_hours(int[][] employee_sort) {
		System.out.println("The employees hours are sorted as below:");

		for (int i=0; i<employee_sort[0].length;i++){
			System.out.println("Employee# " + employee_sort[1][i] + " with " + employee_sort[0][i] + " hours");
			}
		}
	}
