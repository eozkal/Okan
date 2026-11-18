package hafta9;

import java.util.Scanner;

public class Metot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Math.max(1, 4));
		selamla();
		selamlaParametreli(scanner.next());
		int x = 3, y = 4, z = 5;
		toplama(x, y, z);
		scanner.close();
		double sonuc = hesapla(1.2, 4.0);
		System.out.println(sonuc);
	}
	
		public static double hesapla(double d, double e) {
		return d + e;
	}
		
		public static void toplama(int i, int j, int k) {
			System.out.printf("%d + %d + %d işleminin sonucu: %d\n", i, j, k, i+j+k);
	}

		public static void selamla() {
			System.out.println("Hello, World!");
	}
		
		public static void selamlaParametreli(String ad) {
			System.out.printf("Hello, %s!\n", ad);
	}

}
