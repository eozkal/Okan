package hafta10;

public class Array {

	public static void main(String[] args) {
		int sayi[] = new int[5];
		sayi[0] = 111;
		sayi[0] = 2111;
		sayi[2] = 71;
		sayi[3] = 161;
		System.out.println(sayi[1]);
		System.out.println(sayi);
		System.out.println("----------------");
		for (int i = 0; i < sayi.length; i++) {
			System.out.println(i + ". sayı: " + sayi[i]);
		}
		System.out.println("----------------");
		int total = 0;
		for (int data : sayi) {
			System.out.println(data);
			total += data;
		}
		System.out.println("Toplam: " + total);
		
	}

}
