package Java;

import java.util.Scanner;

public class ProgramToAddTwoNumbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int s1, s2, a, b;
			System.out.println("Enter the two numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			s1 = a + b;
			System.out.println("The sum of two numbers = " + s1);
			s2 = display(a, b);
			System.out.println("The subtraction is " + s2);		
		}
	}

	public static int display(int a, int b) {
	    int s;
		s = a - b;
		return s;
		
	}
}
