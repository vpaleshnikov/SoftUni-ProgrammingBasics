import java.util.Scanner;

public class p15_FruitAndVegShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double vegKg = Double.parseDouble(scanner.nextLine());
        double fruitKg = Double.parseDouble(scanner.nextLine());
        double vegCost = vegPrice * vegKg;
        double fruitCost = fruitPrice * fruitKg;
        double finalCost = (vegCost + fruitCost) / 1.94;
        System.out.println(finalCost);
    }
}
