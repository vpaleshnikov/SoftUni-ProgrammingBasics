import java.util.Scanner;

public class Problem05_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".",n) +
        repeatStr("*",3 * n) +
        repeatStr(".",n));
        int point = n - 1;
        int midPoint = n * 3;
        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatStr(".",point) + "*" +
            repeatStr(".",midPoint) + "*" +
            repeatStr(".",point));
            point--;
            midPoint = midPoint + 2;
        }
        System.out.println(repeatStr("*",5 * n));

        int bottomPoint = 1;
        int bottomMidPoint = 5 * n - 4;
        for (int i = 0; i < n * 2; i++) {
            System.out.println(repeatStr(".",bottomPoint) + "*" +
            repeatStr(".",bottomMidPoint) + "*" +
            repeatStr(".",bottomPoint));
            bottomPoint++;
            bottomMidPoint = bottomMidPoint - 2;
        }
        System.out.println(repeatStr(".",bottomPoint) + "*" +
        repeatStr("*",bottomMidPoint) + "*" +
        repeatStr(".",bottomPoint));
    }
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
