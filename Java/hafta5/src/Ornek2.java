import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte num;
		
		System.out.println("Bir sayı giriniz: ");
		num = scanner.nextByte();
		
		switch(num) {
		case 1: System.out.println("1 girdiniz."); break;
		case 2: System.out.println("2 girdiniz."); break;
		case 4: System.out.println("4 girdiniz."); break;
		default: System.out.println("Farklı girdiniz."); break;
		
		}
		
		scanner.close();
		
	}

}
