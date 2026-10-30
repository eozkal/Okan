package hafta6;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pass = "1234";
		System.out.print("Enter your password: ");
		while (!pass.equals(scanner.next())) System.out.print("Incorrect password, try again: ");
		System.out.print("Access granted.");
		
		scanner.close();

	}

}
