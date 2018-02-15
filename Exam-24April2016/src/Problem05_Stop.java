import java.util.Scanner;

public class Problem05_Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(".",n + 1) +
        repeatStr("_",n * 2 + 1) +
        repeatStr(".",n + 1));

        int pointUp = n;
        int underscoreUp = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(".",pointUp) + "//" +
            repeatStr("_",underscoreUp) + "\\\\" +
            repeatStr(".",pointUp));
            pointUp--;
            underscoreUp = underscoreUp + 2;
        }
        System.out.println("//" + repeatStr("_",2 * n - 3) +
        "STOP!" + repeatStr("_",2 * n - 3) + "\\\\");

        int pointDown = 0;
        int underscoreDown = 4 * n - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(".",pointDown) + "\\\\" +
            repeatStr("_",underscoreDown) + "//" +
            repeatStr(".",pointDown));
            pointDown++;
            underscoreDown = underscoreDown - 2;
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
