import java.util.Scanner;

public class Progblem06_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int i = 0;
        int j = 0;
        int position = 0;

        for (i = a; i <= b; i++) {
            for (j = a; j <= b; j++) {
                sum = i + j;
                position++;
                if (sum == magicNum) {
                    break;
                }
            }
            if (sum == magicNum) {
                break;
            }
        }
        if (sum == magicNum) {
            System.out.print("Combination N:" + position + " ");
            System.out.printf("(%d + %d = %d)%n", i, j, sum);
        } else {
            System.out.println(position + " combinations - neither equals " + magicNum);
        }
    }
}