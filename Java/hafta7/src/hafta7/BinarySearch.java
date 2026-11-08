package hafta7;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ile 100 arasında bir sayı düşünün, onu tahmin edeceğim.");
		String sonuc = "";
		int tahmin = 50, tahminSayısı = 0;
		double aralik = 50;
		
		while (Math.abs(aralik) >= 0.5) {
			System.out.println("Tahmininiz: " + tahmin + "?\nTahminim bu sayıdan... (K)üçük, (B)üyük, (E)şit.");
			sonuc = scanner.next();
			
			do {
				if (sonuc.equalsIgnoreCase("e")) {System.out.println("Sayınızı " + tahminSayısı + " tahminde buldum."); break;}
				else if (sonuc.equalsIgnoreCase("k")) aralik = -Math.abs(aralik);
				else if (sonuc.equalsIgnoreCase("b")) aralik = +Math.abs(aralik);
				else System.out.println("Hatalı giriş yaptınız. Yeniden deneyin: ");
			} while (!(sonuc.equalsIgnoreCase("e")||sonuc.equalsIgnoreCase("k")||sonuc.equalsIgnoreCase("b")));

			aralik /= 2;
			tahmin = (int) Math.round(tahmin + aralik);
			tahminSayısı++;
			
		}
	
		scanner.close();
		
		}
	
	}