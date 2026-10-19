import java.util.Scanner;

public class kare {

	public static void main(String[] args) {
		int kenar;
		Scanner Klavye = new Scanner(System.in);
		
		System.out.println("Kare kenarı giriniz: ");
		kenar = Klavye.nextInt();
		
		System.out.println(kenar * 4);
		
		Klavye.close();

	}

}
