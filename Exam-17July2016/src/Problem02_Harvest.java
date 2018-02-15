import java.util.Scanner;

public class Problem02_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrape = x * y;
        double wine = (allGrape * 0.4) / 2.5;

        if (wine >= z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",wine);
            double left = Math.abs(wine - z);
            left = Math.ceil(left);
            double litersPerPerson = Math.abs(left / workers);
            litersPerPerson = Math.ceil(litersPerPerson);
            System.out.printf("%.0f liters left -> %.0f liters per person.",left,litersPerPerson);
        } else if (wine < z){
            double notEnough = Math.abs(wine - z);
            notEnough = Math.floor(notEnough);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",notEnough);
        }
    }
}
