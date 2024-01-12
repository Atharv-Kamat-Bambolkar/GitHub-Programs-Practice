package Java;

import java.util.Scanner;

public class ProgramToAddTwoNumbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int s, a, b;
			System.out.println("Enter the two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			s = a + b;
			System.out.println("The sum of two numbers = " + s);
		}
	}

}
