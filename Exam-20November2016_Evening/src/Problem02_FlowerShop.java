import java.util.Scanner;

public class Problem02_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double priceMagnolia = 3.25;
        double priceHyacinth = 4;
        double priceRoses = 3.50;
        double priceCactus = 8;

        double sum = (magnolia * priceMagnolia) +
                (hyacinth * priceHyacinth) +
                (roses * priceRoses) +
                (cactus * priceCactus);
        double profit = sum - (sum * 0.05);

        if (giftPrice > profit){
            double notEnough = Math.ceil(giftPrice - profit);
            System.out.printf("She will have to borrow %.0f leva.",notEnough);
        } else if (giftPrice <= profit){
            double left = Math.floor(profit - giftPrice);
            System.out.printf("She is left with %.0f leva.",left);
        }
    }
}
