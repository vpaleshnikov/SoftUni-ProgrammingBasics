import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());
        int score = 0;
        int move = 0;

        for (int i = 1; i <= n ; i++) {
            for (int j = m; j >= 1 ; j--) {
                score = score + ((i * 2) + (j * 3));
                move++;
                if (score >= controlNum){
                    break;
                }
            }
            if (score >= controlNum){
                break;
            }
        }
        if (score >= controlNum) {
            System.out.println(move + " moves");
            System.out.printf("Score: %d >= %d%n", score, controlNum);
        } else {
            System.out.println(move + " moves");
        }
    }
}
