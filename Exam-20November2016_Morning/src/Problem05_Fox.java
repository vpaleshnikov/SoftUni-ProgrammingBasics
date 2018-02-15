import java.util.Scanner;

public class Problem05_Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;
        int dash = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", stars) +
                    "\\" + repeatStr("-", dash) + "/" +
                    repeatStr("*", stars));
            stars++;
            dash = dash - 2;
        }
        int starsMid = n / 2;
        int starsMidMid = n;
        for (int i = 0; i < n / 3; i++) {
            System.out.println("|" + repeatStr("*", starsMid) + "\\" +
                    repeatStr("*", starsMidMid) + "/" + repeatStr("*", starsMid) + "|");
            starsMid++;
            starsMidMid = starsMidMid - 2;
        }
        int dashBottom = 1;
        int starsBottom = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("-", dashBottom) + "\\" +
                    repeatStr("*", starsBottom) + "/" + repeatStr("-", dashBottom));
            dashBottom++;
            starsBottom = starsBottom - 2;
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
