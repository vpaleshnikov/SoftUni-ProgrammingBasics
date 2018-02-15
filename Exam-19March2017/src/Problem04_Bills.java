import java.util.Scanner;

public class Problem04_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricity = 0.0;
        double water = 20.0;
        double internet = 15.0;
        double others = 0.0;
        double others2 = 0.0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            others = ((electricityBill + water + internet) * 0.2) + (electricityBill + water + internet);
            others2 = others + others2;
            electricity = electricity + electricityBill;
        }
        double waterBill = months * water;
        double internetBill = months * internet;
        double monthlyBill = (electricity + waterBill + internetBill + others2)/months;

        System.out.printf("Electricity: %.2f lv%n",electricity);
        System.out.printf("Water: %.2f lv%n",waterBill);
        System.out.printf("Internet: %.2f lv%n",internetBill);
        System.out.printf("Other: %.2f lv%n",others2);
        System.out.printf("Average: %.2f lv%n",monthlyBill);
    }
}
