import java.util.Scanner;

public class Problem05_Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("@" + repeatStr(" ",n - 2) + "@" + repeatStr(" ",n - 2) + "@");
        System.out.println("**" + repeatStr(" ",n - 3) + "*" + repeatStr(" ",n - 3) + "**");

        int leftDot = 1;
        int middleDot = 1;
        int rightDot = 1;
        int space = n - 5;

        for (int i = 0; i <= (n / 2) - 3 ; i++) {
            System.out.println("*" + repeatStr(".",leftDot) + "*" + repeatStr(" ",space) + "*" +
                    repeatStr(".",middleDot) + "*" + repeatStr(" ",space) + "*" +
            repeatStr(".",rightDot) + "*");
            leftDot++;
            middleDot += 2;
            rightDot++;
            space -= 2;
        }
        System.out.println("*" + repeatStr(".",leftDot) + "*" + repeatStr(".",middleDot) + "*" +
        repeatStr(".",rightDot) + "*");
        System.out.println("*" + repeatStr(".",n / 2) + repeatStr("*",(n - 3)/2) +
        "." + repeatStr("*",(n - 3) / 2) + repeatStr(".",n/2) + "*");

        System.out.println(repeatStr("*",(2 * n) - 1));
        System.out.println(repeatStr("*",(2 * n) - 1));
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
