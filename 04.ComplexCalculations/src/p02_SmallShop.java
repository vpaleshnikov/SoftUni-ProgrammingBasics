import java.util.Scanner;

public class p02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("sofia".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.50 * quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.80 * quantity);
            } else if ("beer".equals(product)) {
                System.out.println(1.20 * quantity);
            } else if ("sweets".equals(product)) {
                System.out.println(1.45 * quantity);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.60 * quantity);
            }
        }
        if ("plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.40 * quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.70 * quantity);
            } else if ("beer".equals(product)) {
                System.out.println(1.15 * quantity);
            } else if ("sweets".equals(product)) {
                System.out.println(1.30 * quantity);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.50 * quantity);
            }
        }
        if ("varna".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(0.45 * quantity);
            } else if ("water".equals(product)) {
                System.out.println(0.70 * quantity);
            } else if ("beer".equals(product)) {
                System.out.println(1.10 * quantity);
            } else if ("sweets".equals(product)) {
                System.out.println(1.35 * quantity);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}