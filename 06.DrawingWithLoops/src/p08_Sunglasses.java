import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String firstAndLastLine = repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2);
        System.out.println(firstAndLastLine);

        for (int i = 0; i < n - 2; i++) {

            String text = "*" + repeatStr("/", n * 2 - 2) + "*";
            String spaces = repeatStr(" ", n);
            String pipes = repeatStr("|", n);
            System.out.print(text);
            int someMath = (n - 2) / 2;

            if (i == someMath && n % 2 != 0){
                System.out.print(pipes);
            } else if (i == someMath - 1 && n % 2 == 0) {
                System.out.print(pipes);
            } else {
                System.out.print(spaces);
            }
            System.out.println(text);

        }

        System.out.println(firstAndLastLine);
        }

        static String repeatStr (String str,int count){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < count; i++) {
                sb.append(str);
            }
            return sb.toString();
        }
    }
