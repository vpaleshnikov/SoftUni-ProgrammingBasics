import java.util.Scanner;

public class Problem01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wiskeyLiterLeva = Double.parseDouble(scanner.nextLine());
        double beerLiterQuantity = Double.parseDouble(scanner.nextLine());
        double wineLiterQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaLiterQuantity = Double.parseDouble(scanner.nextLine());
        double wiskeyLiterQuantity = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = wiskeyLiterLeva / 2;
        double winePriceLiter = rakiaPrice - (rakiaPrice * 0.4);
        double beerPriceLiter = rakiaPrice - (rakiaPrice * 0.8);
        double rakiaSum = rakiaLiterQuantity * rakiaPrice;
        double wineSum = wineLiterQuantity * winePriceLiter;
        double beerSum = beerLiterQuantity * beerPriceLiter;
        double wiskeySum = wiskeyLiterQuantity * wiskeyLiterLeva;
        double total = rakiaSum + wineSum + beerSum + wiskeySum;

        System.out.printf("%.2f%n",total);
    }
}
