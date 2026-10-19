package hafta4;

import java.util.Scanner;

public class vki {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		float boy, kilo;
		float vki;
		String message;
		
		System.out.println("Boyunuzu giriniz (m): ");
		boy = Klavye.nextFloat();
		
		System.out.println("Kilonuzu giriniz (kg): ");
		kilo = Klavye.nextFloat();
		
		vki = kilo / (boy * boy);
		
		message = "Vücut kitle endeksiniz " + vki + ", " ;
		
		if (vki < 18.5) message += "zayıfsınız.";
		else if (vki < 25) message += "sağlıklısınız.";
		else if (vki < 30) message += "şişmansınız.";
		else if (vki < 40) message += "obezsiniz.";
		else message += "aşırı obezsiniz.";
		
		System.out.println(message);
		
		Klavye.close();
		

	}

}
