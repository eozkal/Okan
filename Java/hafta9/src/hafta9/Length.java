package hafta9;

public class Length {

	public static void main(String[] args) {
		double s1 = Toplam(2,3);
		double s2 = Toplam(2,3,5,7,8,5,3);
		double s3 = Toplam(2,3,54.5,32,6,2);
		System.out.printf("%f, %f, %f.", s1, s2, s3);
	}

	public static double Toplam(double... sayilar) {
		double toplam = 0;
		System.out.println("Eleman sayısı: " + sayilar.length);
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(i + 1 + ". sayı: " + sayilar[i]);
			toplam += sayilar[i];
		}
		
		System.out.println(toplam);
		return toplam;

	}

}
