package hafta10;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kişi sayısı: ");
		byte ks = scanner.nextByte();
		String adlar[] = new String[ks];
		byte vnt = 0, fnt = 0, bnt = 0;
		byte vn[] = new byte[ks];
		byte fn[] = new byte[ks];
		byte bn[] = new byte[ks];
		byte menu;
		for (int i = 0; i < ks; i++) {
			System.out.println(i + 1 + ". kişinin adı: ");
			adlar[i] = scanner.next();
			System.out.println(i + 1 + ". kişinin vize notu: ");
			vn[i] = scanner.nextByte();
			System.out.println(i + 1 + ". kişinin final notu: ");
			fn[i] = scanner.nextByte();
			bn[i] = (byte) (vn[i] * 0.4 + fn[i] * 0.6);
		}

		for (;;) {
			System.out.println("1: Öğrenci arama\n2: Bütün öğrenciler\n3: Sınıf not ortalamaları\n4: Ortalamadan başarılı öğrenciler\n0: Çıkış");
			menu = scanner.nextByte();
			switch (menu) {
			case 1:
				System.out.println("Öğrencinin ismi: ");
				String search = scanner.next();
				for (int i = 0; i < ks; i++) {
					if (adlar[i].equalsIgnoreCase(search)) {System.out.printf("İsim: %s\nVize Notu: %d\nFinal Notu: %d\nBaşarı Notu: %d", adlar[i], vn[i], fn[i], bn[i]); break;}					
				}
				break;
			case 2:
				for (int i = 0; i < ks; i++) {
					System.out.printf("İsim: %s\nVize Notu: %d\nFinal Notu: %d\nBaşarı Notu: %d", adlar[i], vn[i], fn[i], bn[i]);
				}
				break;
			case 3:
				for (int i = 0; i < ks; i++) {
					vnt += vn[i];
					fnt += fn[i];
					bnt += bn[i];
				}
				System.out.printf("Vize notu ortalaması: %d\nFinal notu ortalaması: %d\nBaşarı notu ortalaması: %d", vnt/ks, fnt/ks, bnt/ks);
			case 4:
				for (int i = 0; i < ks; i++) {
					bnt += bn[i];
				}
				
				for (int i = 0; i < ks; i++) {
					if (bn[i] > bnt/ks) System.out.printf("İsim: %s\nVize Notu: %d\nFinal Notu: %d\nBaşarı Notu: %d", adlar[i], vn[i], fn[i], bn[i]);
				}
				break;
			case 5:
				System.exit(0);
			
			}
			
		}

	}

}
