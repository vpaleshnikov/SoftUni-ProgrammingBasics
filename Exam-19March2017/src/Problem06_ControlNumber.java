import java.util.Scanner;

public class Problem06_ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int moveCounter = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = m; j >= 1 ; j--) {
                if (sum >= controlNum) {
                    break;
                }
                sum = sum + (i * 2 + j * 3);
                moveCounter++;

            }
        }
        if (sum >= controlNum) {
            System.out.println(moveCounter + " moves");
            System.out.printf("Score: %d >= %d%n", sum, controlNum);
        } else {
            System.out.println(moveCounter + " moves");
        }

    }
}
