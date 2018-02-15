import java.util.Scanner;

public class p11_DrawFort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int under = n * 2 - 4 - 2 * (n / 2);
        int midSpace = (n + 2)/2;
        String top = "/" + repeatStr("^", n / 2) + "\\" + repeatStr("_",under) + "/" + repeatStr("^", n / 2) + "\\";
        System.out.println(top);

        for (int i = 1; i < n - 2; i++) {
            System.out.println("|" + repeatStr(" ",(n * 2)- 2) + "|");
        }
        System.out.println("|" + repeatStr(" ",midSpace) + repeatStr("_",under) + repeatStr(" ",midSpace) + "|");
        System.out.println("\\" + repeatStr("_",n / 2) + "/" + repeatStr(" ",under) + "\\" + repeatStr("_", n / 2) + "/");
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
