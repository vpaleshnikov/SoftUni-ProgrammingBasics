import java.util.Scanner;

public class p03_SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int r = 0; r < n; r++) {
            System.out.print("*");
            for (int c = 0; c < n - 1; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
