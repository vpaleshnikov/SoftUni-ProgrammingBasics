import java.util.Scanner;

public class p11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.println("The even number is: " + n);
                    break;
                } else {
                    System.out.println("Invalid number");
                }
            } catch (Exception e) {
                System.out.println("Invalid Number.");
            }
        }
    }
}