import java.util.Scanner;

public class Ornek4 {

	public static void main(String[] args) {
		byte vizeNotu,finalNotu,basariNotu;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İsim giriniz: ");
		String isim = scanner.nextLine();
		
		System.out.println("Vize notu giriniz: ");
		vizeNotu = scanner.nextByte();
		
		System.out.println("Final notu giriniz: ");
		finalNotu = scanner.nextByte();
		
		basariNotu = (byte) ((vizeNotu * 0.4) + (finalNotu * 0.6));
		
		System.out.printf("Sayın %d, başarı notunuz: %d, %d.", isim, basariNotu, (basariNotu >= 50)?"geçtiniz":"kaldınız") ;
		
		scanner.close();

	}

}
