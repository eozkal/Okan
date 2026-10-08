import java.util.Scanner;

public class cember {

	public static void main(String[] args) {
		Scanner Klavye = new Scanner(System.in);
		System.out.println("Daire yarıçapı giriniz: ");
		double yarıcap = Klavye.nextDouble();
		double cevre = 2 * Math.PI * yarıcap;
		double alan = Math.PI * Math.pow(yarıcap, 2);
		System.out.println("Dairenizin çevresi " + cevre + " ve alanı " + alan);

	}

}
