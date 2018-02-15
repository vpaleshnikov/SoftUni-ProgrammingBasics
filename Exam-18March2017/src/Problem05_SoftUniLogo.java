import java.util.Scanner;

public class Problem05_SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dotsUp = n * 6 - 3;
        int numberSignUp = 1;
        for (int i = 0; i < n * 2 - 1; i++) {
            System.out.print(repeatStr(".",dotsUp));
            System.out.print(repeatStr("#",numberSignUp));
            System.out.println(repeatStr(".",dotsUp));
            dotsUp = dotsUp - 3;
            numberSignUp = numberSignUp + 6;
        }
        System.out.println(repeatStr("#",12 * n - 5));

        int dotsLeft = 2;
        int dotsRight = 3;
        int numberSign = 12 * n - 11;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("|" + repeatStr(".",dotsLeft) + repeatStr("#",numberSign) + repeatStr(".",dotsRight));
            dotsLeft = dotsLeft + 3;
            dotsRight = dotsRight + 3;
            numberSign = numberSign - 6;
        }
        for (int i = 0; i < n - 2; i++) {
            System.out.println("|" + repeatStr(".", 3 * n - 4) +
                    repeatStr("#", 6 * n + 1) +
                    repeatStr(".", 3 * n - 3));
        }
        System.out.println("@" + repeatStr(".", 3 * n - 4) +
                repeatStr("#", 6 * n + 1) +
                repeatStr(".", 3 * n - 3));
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}