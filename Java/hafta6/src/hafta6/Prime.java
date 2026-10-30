package hafta6;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range maximum: ");
        int maxNum = scanner.nextInt();
        
        StringBuilder nums = new StringBuilder();

        for (int i = 2; i <= maxNum; i++) {
            boolean isPrime = true;
            
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                nums.append(i).append(" ");
            }
        }

        System.out.println("Prime numbers: " + nums);
        scanner.close();
    }
}