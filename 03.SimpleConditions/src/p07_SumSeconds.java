import java.util.Scanner;

public class p07_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sum = a + b + c;
        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d",minutes,seconds);
        } else {
            System.out.printf("%d:%d",minutes,seconds);
        }
    }
}
