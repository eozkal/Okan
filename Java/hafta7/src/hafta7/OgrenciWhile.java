package hafta7;

import java.util.Scanner;

public class OgrenciWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte vn, fn, bn;
		String devam = "e";
		int vnt = 0, fnt = 0, bnt = 0, i = 1, ks = 0;

		while (devam.equalsIgnoreCase("e")) {
			System.out.print(i + ". kişinin vize notu: ");
			vn = scanner.nextByte();
			vnt += vn;
			System.out.print(ks + ". kişinin final notu: ");
			fn = scanner.nextByte();
			fnt += fn;
			bn = (byte) ((vn * 0.4) + (fn * 0.6));
			bnt += bn;
			System.out.println(i + ". kişinin başarı notu: " + bn);
			ks++;
			System.out.println("Devam et? (e)");
			devam = scanner.next();
		}
		System.out.printf("Sınıfın vize ortalaması %d\nFinal ortalaması %d\nBaşarı ortalaması %d\n", vnt / ks, fnt / ks, bnt / ks);
		scanner.close();

	}

}
