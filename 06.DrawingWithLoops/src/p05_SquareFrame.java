import java.util.Scanner;

public class p05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstAndLastLine = "+" + repeatStr(" -", n-2) + " +";
        System.out.println(firstAndLastLine);
        for (int i = 0; i < n - 2; i++) {
            String innerLine = "| " + repeatStr("- ", n - 2) + "|";
            System.out.println(innerLine);
        }
        System.out.println(firstAndLastLine);
    }
    static String repeatStr(String str, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}