package mainx;

public class Main {

	public static void main(String[] args) {
		int a = 4;
		boolean b = a == 5;
		
		System.out.println("correct this afirmative "+ b);
		System.out.println("correct this afirmative "+ !b);
		
		// fix the problem
		
		if(a == 4) {
			System.out.println("Good Job");
		}else {
			System.out.println("Bad Job Bro !!!");
		}
		
		
	}

}
