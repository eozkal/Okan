package hafta7;

public class DoWhile {

	public static void main(String[] args) {

		System.out.println("For döngüsü");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i: " + i);
		}

		System.out.println("Do döngüsü");
		int i = 1;
		do {
			System.out.println("i: " + i);
			i++;
		} while (i <= 5);

		System.out.println("While döngüsü");
		i = 1;
		while (i <= 5) {
			System.out.println("i: " + i);
			i++;
		}
	}

}
