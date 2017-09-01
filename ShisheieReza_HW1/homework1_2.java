package homework1_2;

public class homework1_2 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				if (i*j > 2)
					continue;
				System.out.println(i*j);
			}
			System.out.println(i);
		}
	}
}


