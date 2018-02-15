import java.util.Scanner;

public class Problem02_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int plushBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double pricePuzzle = 2.60;
        double priceTalkingDoll = 3;
        double pricePlusBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2;

        double totalSum = (puzzles * pricePuzzle) +
                (talkingDolls * priceTalkingDoll) +
                (plushBears * pricePlusBear) +
                (minions * priceMinion) +
                (trucks * priceTruck);
        double toysAmount = puzzles + talkingDolls + plushBears + minions + trucks;
        double discount = 0;
        if (toysAmount >= 50){
            discount = totalSum * 0.25;
        }
        double finalPrice = totalSum - discount;
        double rentShop = finalPrice * 0.10;
        double profit = finalPrice - rentShop;

        if (profit >= excursionPrice){
            double left = Math.abs(profit - excursionPrice);
            System.out.printf("Yes! %.2f lv left.%n",left);
        } else {
            double notEnough = Math.abs(profit - excursionPrice);
            System.out.printf("Not enough money! %.2f lv needed.%n",notEnough);
        }
    }
}