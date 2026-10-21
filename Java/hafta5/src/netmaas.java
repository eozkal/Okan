import java.util.Scanner;

public class netmaas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String isim; 
		double brut;
		boolean evli;
		int cocuk;
		
		
		System.out.println("İsminiz: ");
		isim = scanner.next();
		
		System.out.println("Brüt maaşınız: ");
		brut = scanner.nextDouble();
		
		System.out.println("Evli misiniz? (true/false): ");
		evli = scanner.nextBoolean();
		
		System.out.println("Çocuk sayınız: ");
		cocuk = scanner.nextInt();
		
		System.out.println("Sayın " + isim + ", net maaşınız: " + ((brut + ((evli?5000:0) + 1000 * cocuk)) * 0.75));
		
		scanner.close();
	}

}
