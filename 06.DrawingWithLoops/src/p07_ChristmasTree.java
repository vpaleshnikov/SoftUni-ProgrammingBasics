import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int height = n + 1;
        for (int i = 0; i < height; i++) {
            String spaces = repeatStr(" ", n - i);
            String stars = repeatStr("*", i);
            String pipe = " | ";
            System.out.println(spaces + stars + pipe + stars + spaces);
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
