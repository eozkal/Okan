import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dk, sms;
		double inter;
		
		System.out.println("Dakika kullanımınız: ");
		dk = scanner.nextInt();
		
		System.out.println("SMS kullanımınız: ");
		sms = scanner.nextInt();
		
		System.out.println("İnternet kullanımınız (GB): ");
		inter = scanner.nextDouble();

	    System.out.println("Faturanız: " + (dk * 0.5 + sms * 0.4 + inter * 20) * 1.3125);
	    
	    scanner.close();

	}

}
