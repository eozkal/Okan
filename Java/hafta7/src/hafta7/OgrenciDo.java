package hafta7;

import java.util.Scanner;

public class OgrenciDo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte vn, fn, bn;
		String devam;
		int vnt = 0, fnt = 0, bnt = 0, ks = 0;

		do {
			ks++;
			System.out.print(ks + ". kişinin vize notu: ");
			vn = scanner.nextByte();
			vnt += vn;
			System.out.print(ks + ". kişinin final notu: ");
			fn = scanner.nextByte();
			fnt += fn;
			bn = (byte) ((vn * 0.4) + (fn * 0.6));
			bnt += bn;
			System.out.println(ks + ". kişinin başarı notu: " + bn);
			System.out.println("Devam et? (e)");
			devam = scanner.next();
		} while (devam.equalsIgnoreCase("e"));
		System.out.printf("Sınıfın vize ortalaması %d\nFinal ortalaması %d\nBaşarı ortalaması %d\n", vnt / ks, fnt / ks,
				bnt / ks);
		scanner.close();

	}

}
