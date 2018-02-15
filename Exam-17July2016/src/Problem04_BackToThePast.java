import java.util.Scanner;

public class Problem04_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double yearTo = Double.parseDouble(scanner.nextLine());

        double age = 18;

        for (int year = 1800; year <= yearTo ; year++) {
            if (year % 2 == 0){
                money = money - 12000;
            } else {
                money = money - (12000 + (age * 50));
            }
            age++;
        }

        if (money > 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(money));
        }
    }
}
