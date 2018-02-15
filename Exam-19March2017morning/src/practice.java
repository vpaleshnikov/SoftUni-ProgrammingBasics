import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int position = 0;
        int i = 0;
        int j = 0;

        for (i = start; i >= end ; i--) {
            for (j = start; j >= end; j--) {
                sum = i + j;
                position++;
                if (sum == magNum){
                    break;
                }
            }
            if (sum == magNum){
                break;
            }
        }
        if (sum == magNum) {
            System.out.print("Combination N:" + position + " ");
            System.out.printf("(%d + %d = %d)%n", i, j, sum);
        } else {
            System.out.println(position + " combinations - neither equals " + magNum);
        }
    }
}
