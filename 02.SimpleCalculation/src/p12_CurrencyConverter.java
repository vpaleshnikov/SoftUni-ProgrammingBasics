import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine().toLowerCase();
        String out = scanner.nextLine().toLowerCase();
        double bgn = 1;
        double usd = 1.79549;
        double eur = 1.95583;
        double gbp = 2.53405;
        if (in.equals("usd")){
            n = n * usd;
        } else if (in.equals("eur")){
            n = n * eur;
        } else if (in.equals("gbp")){
            n = n * gbp;
        }
        if (out.equals("usd")){
            n = n / usd;
        } else if (out.equals("eur")){
            n = n / eur;
        } else if (out.equals("gbp")){
            n = n / gbp;
        }
        System.out.printf("%.2f %s",n,out);
    }
}