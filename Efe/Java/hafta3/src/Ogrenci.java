import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		byte vizeNotu,finalNotu,basariNotu;
		Scanner Klavye = new Scanner(System.in);
		System.out.println("İsim giriniz: ");
		String isim = Klavye.next();
		System.out.println("Vize notu giriniz: ");
		vizeNotu = Klavye.nextByte();
		System.out.println("Final notu giriniz: ");
		finalNotu = Klavye.nextByte();
		basariNotu = (byte) (((vizeNotu * 0.4) + (finalNotu * 0.6)) / 2);
		System.out.println("Sayın " + isim + ", başarı notunuz: " + basariNotu);

	}

}
