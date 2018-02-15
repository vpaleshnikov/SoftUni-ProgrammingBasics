import java.util.Scanner;

public class Problem05_ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".",2 * n - 1) + "/|\\" +
        repeatStr(".",2 * n - 1));
        System.out.println(repeatStr(".",2 * n - 1) + "\\|/" +
                repeatStr(".",2 * n - 1));

        int dots = 2 * n - 1;
        int dash = 0;
        for (int i = 0; i <n * 2 ; i++) {
            System.out.print(repeatStr(".",dots));
            System.out.print("*" + repeatStr("-",dash) +
                    "*" + repeatStr("-",dash) + "*");
            System.out.println(repeatStr(".",dots));
            dots--;
            dash++;
        }
        System.out.println(repeatStr("*",4 * n + 1));
        System.out.println(repeatStr("*.",(4 * n + 1)/2) + "*");
        System.out.println(repeatStr("*",4 * n + 1));

    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
