import java.util.Scanner;

public class Problem05_Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int dots = (3 * n - 2) / 2;
        int space = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(repeatStr(".",dots) + "/" +
            repeatStr(" ",space) + "\\" +
            repeatStr(".",dots));
            dots--;
            space = space + 2;
        }
        System.out.println(repeatStr(".",n / 2) +
        repeatStr("*",n * 2) +
        repeatStr(".",n / 2));

        for (int i = 0; i < n * 2; i++) {
            System.out.println(repeatStr(".",n / 2) +
            "|" + repeatStr("\\",n * 2 - 2) + "|" +
            repeatStr(".",n / 2));
        }
        int dotsBottom = n / 2;
        int starsBottom = n * 2 - 2;
        for (int i = 0; i < n / 2; i++) {
            System.out.println(repeatStr(".",dotsBottom) +
            "/" + repeatStr("*",starsBottom) + "\\" +
            repeatStr(".",dotsBottom));
            dotsBottom--;
            starsBottom = starsBottom + 2;
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
