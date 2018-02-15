import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int maxComb = Integer.parseInt(scanner.nextLine());
        int move = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                System.out.printf("<%d-%d>",i,j);
                move++;
                if (move == maxComb){
                    break;
                }
            }
            if (move == maxComb){
                break;
            }

        }
    }
}
