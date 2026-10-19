package hafta4;

import java.util.Scanner;

public class karsilastirma {

	public static void main(String[] args) {
		byte vn, fn, bn;
		String ad, message;
		
		Scanner Klavye = new Scanner(System.in);
		
		System.out.print("Ad giriniz: ");
		ad = Klavye.next();
		
		System.out.print("Vize notu giriniz: ");
		vn = Klavye.nextByte();
		
		System.out.print("Final notu giriniz: ");
		fn = Klavye.nextByte();
		
		bn = (byte) ((vn * 0.4) + (fn * 0.6));
		
		if (bn > 100 || bn < 0) {System.out.println("Başarı notu geçersizdir."); Klavye.close(); return;}
		
		message = "Sayın " + ad + ", " + bn + " başarı notuyla ve ";
		
		if (bn < 30) message += "FF";
		else if (bn < 40) message += "DD";
		else if (bn < 50) message += "DC";
		else if (bn < 60) message += "CC";
		else if (bn < 70) message += "CB";
		else if (bn < 80) message += "BB";
		else if (bn < 90) message += "BA";
		else message += "AA";
		
		message += " harf karşılığıyla";
		
		if (bn >= 50)message += " geçtiniz.";
		else message += " kaldınız.";
		
		System.out.println(message);
		
		Klavye.close();
			
	}

}
