import java.util.Scanner;

public class p15_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n ; b++) {
                for (int c = 'a'; c < 'a' + l; c++) {
                    for (int d = 'a'; d < 'a' + l; d++) {
                        for (int e = Math.max(a,b)+ 1; e <= n ; e++) {
                            System.out.printf("%d%d%c%c%d ",a,b,c,d,e);
                        }
                    }
                }
            }
        }
    }
}