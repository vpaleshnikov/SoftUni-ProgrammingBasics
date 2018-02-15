import java.util.Scanner;

public class Problem05_Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String top = "+" + repeatStr("~",n - 2) + "+" + repeatStr(".",2 * n + 1);
        System.out.println(top);
        int dotsLeft = 0;
        int dotsRight = 2 * n;
        for (int i = 0; i <= 2 * n; i++) {
            System.out.println("|" + repeatStr(".",dotsLeft) + "\\" + repeatStr("~",n - 2) + "\\" +
            repeatStr(".",dotsRight));
            dotsLeft++;
            dotsRight--;
        }
        int dotLeft = 0;
        int dotRight = 2 * n;
        for (int i = 2 * n; i <= 4 * n; i++) {
            System.out.print(repeatStr(".",dotLeft) + "\\" + repeatStr(".",dotRight));
            System.out.println("|" + repeatStr("~",n - 2) + "|");
            dotLeft++;
            dotRight--;
        }
        System.out.println(repeatStr(".",2 * n + 1) + "+" + repeatStr("~",n - 2) + "+");
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}