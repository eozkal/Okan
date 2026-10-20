package hafta4;

import java.util.Scanner;

public class vki {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double boy, kilo, vki;
		String message;
		
		System.out.println("Boyunuzu giriniz (m): ");
		boy = scanner.nextDouble();
		
		System.out.println("Kilonuzu giriniz (kg): ");
		kilo = scanner.nextDouble();
		
		vki = kilo / (boy * boy);
		
		message = "Vücut kitle endeksiniz " + vki + ", " ;
		
		if (vki < 18.5) message += "zayıfsınız.";
		else if (vki < 25) message += "sağlıklısınız.";
		else if (vki < 30) message += "şişmansınız.";
		else if (vki < 40) message += "obezsiniz.";
		else message += "aşırı obezsiniz.";
		
		System.out.println(message);
		
		scanner.close();
		

	}

}
