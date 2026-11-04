package hafta7;

import java.util.Scanner;

public class OgrenciFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte vn, fn, bn, ks;
		int vnt = 0, fnt = 0, bnt = 0;
		System.out.print("Öğrenci sayısı: ");
		ks = scanner.nextByte();
		for (int i = 1; i <= ks; i++) {
			System.out.print(i + ". kişinin vize notu: ");
			vn = scanner.nextByte();
			vnt += vn;
			System.out.print(i + ". kişinin final notu: ");
			fn = scanner.nextByte();
			fnt += fn;
			bn = (byte) ((vn * 0.4) + (fn * 0.6));
			bnt += bn;
			System.out.println(i + ". kişinin başarı notu: " + bn);
		}
		System.out.printf("Sınıfın vize ortalaması %d\nFinal ortalaması %d\nBaşarı ortalaması %d\n", vnt/ks, fnt/ks, bnt/ks);
		scanner.close();

	}

}
