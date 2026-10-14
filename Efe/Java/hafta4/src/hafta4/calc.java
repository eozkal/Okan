package hafta4;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		byte act;
		float n1, n2, sonuc;
		System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
		act = Klavye.nextByte();
		
		System.out.println("İlk sayı: ");
		n1 = Klavye.nextByte();
		
		System.out.println("İkinci sayı: ");
		n2 = Klavye.nextByte();
		
		if (act == 1) sonuc = n1 + n2;
		else if (act == 2) sonuc = n1 + n2;
		else if (act == 3) sonuc = n1 * n2;
		else if (act == 4) sonuc = n1 / n2;
		else {System.out.println("Geçersiz işlem."); return;}
		
		System.out.println("Sonuç: " + sonuc);

	}

}
