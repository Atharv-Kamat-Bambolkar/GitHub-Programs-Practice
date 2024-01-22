package githubPrograms;

import java.util.Scanner;

public class ReadandPrintanIntegerValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the integer: ");
		try (Scanner s = new Scanner(System.in)) {
			num = s.nextInt();
		}
		System.out.println("Entered integer is: " + num);
	}

}
