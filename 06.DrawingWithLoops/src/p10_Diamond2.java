import java.util.Scanner;

public class p10_Diamond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int topStar = 1;
        if (n % 2 == 0){
            topStar = 2;
        }
        int dashUp = (n - 1) / 2;
        int dashUpMid = 1;
        if (n % 2 == 0){
            dashUpMid = 2;
        }

        System.out.println(repeatStr("-",dashUp) +
                repeatStr("*",topStar) +
                repeatStr("-",dashUp));
        dashUp--;
        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.println(repeatStr("-",dashUp) + "*" +
            repeatStr("-",dashUpMid) + "*" +
            repeatStr("-",dashUp));
            dashUp--;
            dashUpMid = dashUpMid + 2;
        }
        dashUpMid = n - 4;
        dashUp = 1;
        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.println(repeatStr("-",dashUp) + "*" +
                    repeatStr("-",dashUpMid) + "*" +
                    repeatStr("-",dashUp));
            dashUp++;
            dashUpMid = dashUpMid - 2;
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