import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num, tot = 0;
		int c = 0;

		System.out.print("Sayı giriniz. (çıkış için \"0\"): ");
		num  = scanner.nextInt();
		
		while (num != 0) {
			c += 1;
			tot += num;
			System.out.print("Ortalama " + tot/c + ". yeniden giriniz. (çıkış için \"0\"): ");
			num = scanner.nextInt();
		}
		
		scanner.close();

	}

}
