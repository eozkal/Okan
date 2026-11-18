package hafta9;

public class Overload {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		int sonucInt = ortalama(x, y, z);
		double a = 3.14, b = 2.71, c = 13.37;
		double sonucDouble = ortalama(a, b, c);
		System.out.println("3 sayının ortalaması (int): " + sonucInt);
		System.out.println("3 sayının ortalaması (double): " + sonucDouble);
	}

	public static double ortalama(double a, double b, double c) {
		return (a+b+c) /3;
	}

	public static int ortalama(int a, int b, int c) {
		return (a+b+c) /3;
	}

}
