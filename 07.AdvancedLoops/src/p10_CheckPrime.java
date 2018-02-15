import java.util.Scanner;

public class p10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
            if (isPrime && n > 1){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
