import java.util.Scanner;

public class Problem06_StopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n ; i--) {
            if (i % 3 == 0 && i % 2 == 0 && i != s){
                System.out.print(i + " ");
            }
            if (i % 3 == 0 && i % 2 == 0 && i == s){
                return;
            }
        }
    }
}
