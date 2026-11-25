package hafta10;

import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kişi sayısı: ");
		byte ks = scanner.nextByte();
		String adlar[] = new String[ks];
		byte vn[] = new byte[ks];
		byte fn[] = new byte[ks];
		byte bn[] = new byte[ks];
		int toplam = 0;
		
		for (int i = 0; i < ks; i++) {
			System.out.println(i + 1 + ". kişinin adı: ");
			adlar[i] = scanner.next();
			System.out.println(i + 1 + ". kişinin vize notu: ");
			vn[i] = scanner.nextByte();
			System.out.println(i + 1 + ". kişinin final notu: ");
			fn[i] = scanner.nextByte();
			bn[i] = (byte) (vn[i] * 0.4 + fn[i] * 0.6);
		}
		
		for (byte b : bn) {
			toplam += b;
		}

		byte bnOrt = (byte) (toplam/ks);
		System.out.println("Başarı notları ortalaması: " + bnOrt);
		for (int i = 0; i < bn.length; i++) {
			if (bn[i] > bnOrt) {
				System.out.printf("İsim: %s\nVize Notu: %d\nFinal Notu: %d\nBaşarı Notu: %d", adlar[i], vn[i], fn[i], bn[i]);
			}
		}
		scanner.close();

	}

}
