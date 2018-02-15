import java.util.Scanner;

public class p07_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumRight = sumRight + num;
        }
        int diff = Math.abs(sumLeft - sumRight);
        if (diff == 0){
            System.out.printf("Yes, sum = %d%n",sumLeft );
        } else {
            System.out.printf("No, diff = %d%n",diff);
        }
    }
}
