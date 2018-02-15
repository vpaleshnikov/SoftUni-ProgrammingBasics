import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        boolean inRange = (a >= 100 && a <= 200) || a == 0;

        if (!inRange){
            System.out.println("invalid");
        }
        }
    }