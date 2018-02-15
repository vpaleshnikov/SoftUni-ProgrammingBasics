import java.util.Scanner;

public class Problem05_Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr("*",n * 2 + 1));
        System.out.println(".*" + repeatStr(" ",(n * 2 + 1) - 4) + "*.");
        int dotsUp = 2;
        int a = (n * 2 + 1) - 6;
        for (int i = 0; i <= n - 3; i++) {
            System.out.print(repeatStr(".",dotsUp) + "*");
            System.out.print(repeatStr("@",a));
            System.out.println("*" + repeatStr(".",dotsUp));
            dotsUp++;
            a = a - 2;
        }
        System.out.println(repeatStr(".",n) + "*" + repeatStr(".",n));
        int dotsDown = n - 1;
        int space = 0;
        for (int i = n - 4; i <= 2 * n - 7; i++) {
            System.out.print(repeatStr(".",dotsDown));
            System.out.print("*" + repeatStr(" ",space) + "@" + repeatStr(" ",space) + "*");
            System.out.println(repeatStr(".",dotsDown));
            dotsDown--;
            space++;
        }
        System.out.println(".*" + repeatStr("@",(n * 2 + 1) - 4) + "*.");
        System.out.println(repeatStr("*",n * 2 + 1));

    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
