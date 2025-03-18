package mainx;

public class Main {

	public static void main(String[] args) {
		int a = 4;
		boolean b = a == 5;
		
		System.out.println("correct this afirmative "+ b);
		System.out.println("correct this afirmative "+ !b);
		
		if (a == 5) {
			System.out.println("around want to going ");
		}else {
			System.out.println("o baby "+ a++);
		}
		
		if (a == 4) {
			System.out.println("around want to going ");
		}else {
			System.out.println("o baby "+ ++a);
		}
		
		
	}

}
