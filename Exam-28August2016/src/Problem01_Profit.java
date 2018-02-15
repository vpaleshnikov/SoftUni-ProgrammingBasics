import java.util.Scanner;

public class Problem01_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double earnMoneyADay = Double.parseDouble(scanner.nextLine());
        double currencyDollar = Double.parseDouble(scanner.nextLine());

        double monthlyWage = workDays * earnMoneyADay;
        double yearlyWage = (monthlyWage * 12) + (monthlyWage * 2.5);
        double tax = yearlyWage * 0.25;
        double fullYearlyWage = yearlyWage - tax;
        double lv = fullYearlyWage * currencyDollar;
        double earnsADay = lv / 365;

        System.out.printf("%.2f",earnsADay);

    }
}
