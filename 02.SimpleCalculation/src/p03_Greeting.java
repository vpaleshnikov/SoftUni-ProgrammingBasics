import java.util.Scanner;

public class p03_Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Print your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
