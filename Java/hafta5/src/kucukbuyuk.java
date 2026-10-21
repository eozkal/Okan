import java.util.Scanner;

public class kucukbuyuk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, s, b;
		
		System.out.println("Birinci sayı: ");
		n1 = scanner.nextInt();
		
		System.out.println("İkinci sayı: ");
		n2 = scanner.nextInt();
		
		s = (n1<n2) ? n1:n2;
		b = (n1<n2) ? n2:n1;
		
		System.out.printf("Büyük sayı %d, küçük sayı %d.", b, s);
 
		scanner.close();
		
	}

}
