import java.util.Scanner;

public class p06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String spaces = repeatStr(" ", n - i);
            System.out.print(spaces + repeatStr(" *",i).trim());
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            String spaces = repeatStr(" ", n - i);
            System.out.print(spaces + repeatStr(" *",i).trim());
            System.out.println();
        }
    }

    static String repeatStr (String str,int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
