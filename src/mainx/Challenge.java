package mainx;

import java.util.Scanner;

public class Challenge {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("written your ago salary you to have");
		float salary = read.nextFloat();
		float percentage = 30.0f;
		float showIdealSalary = salary * (percentage / 100);
		System.out.println("this is salary to have 30% " + showIdealSalary);
		
		float showIdealSalary15 = showIdealSalary * 15.0f / 100;
		System.out.println("this is salary to have 15% " + showIdealSalary);
		
		float showIdealSalary5 = showIdealSalary * 5.0f / 100;
		System.out.println("this is salary to have 5% " + showIdealSalary5);
		

		read.close();
	}

}
