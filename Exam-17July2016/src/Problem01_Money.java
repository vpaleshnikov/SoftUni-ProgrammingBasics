import java.util.Scanner;

public class Problem01_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine()) / 100.00;

        double bitcoinValueLv = bitcoins * 1168;
        double yuanUsd = yuan * 0.15;
        double usdLv = yuanUsd * 1.76;

        double lv = bitcoinValueLv + usdLv;
        double euro = lv / 1.95;
        euro = euro - (commision * euro);
        System.out.println(euro);
    }
}
