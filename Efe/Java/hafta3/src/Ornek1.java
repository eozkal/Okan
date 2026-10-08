
public class Ornek1 {

	public static void main(String[] args) {
		String isim = "Efe";
		byte vizeNotu,finalNotu,basariNotu;
		vizeNotu = 40;
		finalNotu = 70;
		basariNotu = (byte) (((vizeNotu * 0.4) + (finalNotu * 0.6)) / 2);
		System.out.println("Sayın " + isim + ", başarı notunuz: " + basariNotu);

	}

}
