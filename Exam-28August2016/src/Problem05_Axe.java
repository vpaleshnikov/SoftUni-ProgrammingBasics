import java.util.Scanner;

public class Problem05_Axe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftDash = n * 3;
        int midDash = 0;
        int rightDash = n * 2 - 2;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("-",leftDash) +
            "*" + repeatStr("-",midDash) + "*" +
            repeatStr("-",rightDash));
            midDash++;
            rightDash--;
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr("*",n * 3 + 1) +
            repeatStr("-",n - 1) + "*" +
            repeatStr("-",n - 1));
        }
        int leftDashBottom = n * 3;
        int midDashBottom = n - 1;
        int rightDashBottom = n - 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.println(repeatStr("-",leftDashBottom) + "*" +
            repeatStr("-",midDashBottom) + "*" +
            repeatStr("-",rightDashBottom));
            leftDashBottom--;
            midDashBottom = midDashBottom + 2;
            rightDashBottom--;
        }
        System.out.println(repeatStr("-",leftDashBottom) + "*" + repeatStr("*",midDashBottom) + "*" +
                repeatStr("-",rightDashBottom));

    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
