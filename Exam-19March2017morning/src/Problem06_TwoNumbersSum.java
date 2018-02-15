import java.util.Scanner;

public class Problem06_TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int position = 0;
        int i = 0;
        int j = 0;


        for (i = a; i >= b; i--) {
            for (j = a; j >= b; j--) {
                position++;
                sum = i + j;
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
            System.out.println("(" + i + " + " + j + " = " + sum + ")");
        } else {
            System.out.println(position + " combinations - neither equals " + magicNum);
        }

    }
}