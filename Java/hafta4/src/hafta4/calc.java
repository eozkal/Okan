package hafta4;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte act;
		float n1, n2, sonuc;
		String islem;
		System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
		act = scanner.nextByte();
		
		System.out.println("İlk sayı: ");
		n1 = scanner.nextFloat();
		
		System.out.println("İkinci sayı: ");
		n2 = scanner.nextFloat();
		
		if (act == 1) {sonuc = n1 + n2; islem = "+";}
		else if (act == 2) {sonuc = n1 - n2; islem = "-";}
		else if (act == 3) {sonuc = n1 * n2; islem = "*";}
		else if (act == 4) {sonuc = n1 / n2; islem = "/";}
		else {System.out.println("Geçersiz işlem."); scanner.close(); return;}
		
		System.out.println(n1 + " " + islem + " " + n2 + " işleminin sonucu " + sonuc);
		
		scanner.close();

	}

}
