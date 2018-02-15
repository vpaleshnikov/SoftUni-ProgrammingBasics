import java.util.Scanner;

public class p14_NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currN = 0;
        int step = 1;
        for (int r = 1; r <= n; r++) {
            currN = r;
            step = 1;
            for (int c = 0; c < n; c++) {
                System.out.printf("%d ", currN);
                if (currN >= n){
                    step = -1;
                }
                currN = currN + step;
            }
            System.out.println();
        }
    }
}
