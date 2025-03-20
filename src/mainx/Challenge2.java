package mainx;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("write your age current");
		byte age = read.nextByte();
		if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");
		}
		if (age != 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");
		}
		read.close();
	}

}
