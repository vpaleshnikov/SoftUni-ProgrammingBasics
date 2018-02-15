import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstNum = (n/100)%10;
        int secondNum = (n/10)%10;
        int thirdNum = n%10;

        for (int i = 0; i < firstNum + secondNum; i++) {
            System.out.println();
            for (int j = 0; j < firstNum + thirdNum; j++) {
                if (n % 5 == 0){
                    n = n - firstNum;
                    System.out.print(n + " ");
                } else if (n % 3 == 0) {
                    n = n - secondNum;
                    System.out.print(n + " ");
                } else {
                    n = n + thirdNum;
                    System.out.print(n + " ");
                }
            }
        }
    }
}
