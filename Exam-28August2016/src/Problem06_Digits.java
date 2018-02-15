import java.util.Scanner;

public class Problem06_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstNumber = (n/100)%10;
        int secondNumber = (n/10)%10;
        int thirdNumber = n%10;

        for (int i = 1; i <= firstNumber + secondNumber; i++) {
            for (int j = 1; j <= firstNumber + thirdNumber; j++) {
                if (n % 5 == 0){
                    n = n - firstNumber;
                    System.out.print(n + " ");
                } else if (n % 3 == 0){
                    n = n - secondNumber;
                    System.out.print(n + " ");
                } else {
                    n = n + thirdNumber;
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
