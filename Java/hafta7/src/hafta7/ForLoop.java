package hafta7;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    scanner.close();
	    
	    for (int i = 1; i <= 5; i++) {
	    	System.out.println(i);
	    	System.out.println("okan");
		}
	    
	    int i = 1;
	    for (; i <= 5;) {
	    	System.out.println(i);
	    	System.out.println("okan");
	    	i++;
		}
	    
	    i = 1;
	    for (;;) {
			System.out.println(i + " okan");
			if (i == 8) break;
			if (i == 3 || i == 6) continue;
			i++;
			
		}
	    
	}

}
