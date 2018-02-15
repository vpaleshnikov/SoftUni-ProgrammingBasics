import java.util.Scanner;

public class p12_ButterFly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeat("*", n - 2) + "\\ /" + repeat("*", n - 2));
            } else {
                System.out.println(repeat("-", n - 2) + "\\ /" + repeat("-", n - 2));
            }
        }
        System.out.println(repeat(" ", n - 1) + "@");
        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeat("*", n - 2) + "/ \\" + repeat("*", n - 2));
            } else {
                System.out.println(repeat("-", n - 2) + "/ \\" + repeat("-", n - 2));
            }
        }
    }
    static String repeat(String str, int count){
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count ; i++) {
            repeated.append(str);
        }
        return repeated.toString();
    }
}