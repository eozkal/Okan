import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s1, s2;
		byte menu;
		
		System.out.println("Birinci sayı: ");
		s1 = scanner.nextInt();
		
		System.out.println("İkinci sayı: ");
		s2 = scanner.nextInt();
		
		System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
		menu = scanner.nextByte();
		
	   switch(menu) {
	   
	   case 1: System.out.println(s1 + "+" + s2 + " işleminin sonucu: " + (s1 + s2)); break;
	   case 2: System.out.println(s1 + "-" + s2 + " işleminin sonucu: " + (s1 - s2)); break;
	   case 3: System.out.println(s1 + "*" + s2 + " işleminin sonucu: " + (s1 * s2)); break;
	   case 4: System.out.println(s1 + "/" + s2 + " işleminin sonucu: " + (s1 / s2)); break;
	   default: System.out.println("Geçersiz işlem.");
	   
	   }
	   
	   scanner.close();
	   
	}

}
