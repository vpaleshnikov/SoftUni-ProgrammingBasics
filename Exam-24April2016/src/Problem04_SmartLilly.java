import java.util.Scanner;

public class Problem04_SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double toys = 0;
        double money = 0;
        double savings = 0;

        for (int birthday = 1; birthday <= age ; birthday++) {
            if (birthday % 2 != 0){
                toys++;
            } else {
                money = money + 10.00;
                savings = savings + money;
                savings = savings - 1;
            }
        }
        double selledToys = toys * toyPrice;
        double all = savings + selledToys;

        if (all >= priceWashingMachine){
            double left = Math.abs(all - priceWashingMachine);
            System.out.printf("Yes! %.2f%n",left);
        } else if (all < priceWashingMachine){
            double notEnough = Math.abs(all - priceWashingMachine);
            System.out.printf("No! %.2f%n",notEnough);
        }
    }
}
