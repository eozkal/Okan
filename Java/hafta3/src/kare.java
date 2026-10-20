import java.util.Scanner;

public class kare {

	public static void main(String[] args) {
		int kenar;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kare kenarı giriniz: ");
		kenar = scanner.nextInt();
		
		System.out.println(kenar * 4);
		
		scanner.close();

	}

}
