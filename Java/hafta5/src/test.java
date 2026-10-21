import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double m;
		
		System.out.print("Metre cinsinden uzunluk giriniz: ");
		m = scanner.nextDouble();
		
		System.out.println("Uzunluk dm cinsinden: " + m * 10 + ", cm cisninden: " + m * 100 + " ve mm cisninden: " + m * 1000);
		
		scanner.close();

	}

}
