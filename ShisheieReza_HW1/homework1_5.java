package homework1_5;

public class homework1_5 {
	public static void main(String[] args) {
		int max = 0;
		System.out.println("The value of max before invoke is " + max);
		max = max(1,2,max);
		System.out.println("The value of max after return is " + max);
	}
	
	public static int max(int value1, int value2, int max){
		System.out.println("The value of max jsu as entered is " + max);
		if (value1>value2){
			max = value1;
		} else {
			max = value2;
		}
		System.out.println("The value of max before return is " + max);
		return max;
	}


}
