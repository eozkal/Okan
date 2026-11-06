package hafta7;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ile 100 arasında bir sayı düşünün, onu tahmin edeceğim.");
		String sonuc = "";
		int tahmin = 50, aralik = 50, tahminSayısı = 0;
		for (; aralik == 0 ; tahminSayısı++) {
			System.out.println("Sayı " + tahmin + " mi?");
			sonuc = scanner.next();
		
		}
		
		scanner.close();
		}
	
	}