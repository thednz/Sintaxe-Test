package mainx;

import java.util.Scanner;

public class Challenge {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("written your ago salary you to have");
		float salary = read.nextFloat();
		float percentage = 30.0f;
		float showIdealSalary = (salary * percentage) / 100;
		System.out.println("this is salary to have " + showIdealSalary);

		read.close();
	}

}
