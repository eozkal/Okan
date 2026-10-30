package hafta6;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int i, num = scanner.nextInt();
		String result = "";
		for (i = 0; num != 1; i++) {
			result += num + " -> ";
			if (num % 2 == 0) num /= 2;
			else num = 3 * num + 1;
		}
		System.out.print(result + "1 executed in " + i + " steps.");
		
		scanner.close();
	}

}
