import java.util.Scanner;

public class Problem02_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dni = Integer.parseInt(scanner.nextLine());
        int kgHrana = Integer.parseInt(scanner.nextLine());
        double hranaKucheKg = Double.parseDouble(scanner.nextLine());
        double hranaKotkaKg = Double.parseDouble(scanner.nextLine());
        double hranaKostenurkaGr = Double.parseDouble(scanner.nextLine());

        double nujnaHranaKuche = dni * hranaKucheKg;
        double nujnaHranaKotka = dni * hranaKotkaKg;
        double nujnaHranaKostenurka = dni * (hranaKostenurkaGr / 1000);
        double obshtaHrana = nujnaHranaKuche + nujnaHranaKotka + nujnaHranaKostenurka;

        if (obshtaHrana <= kgHrana){
            double ostavat = Math.floor(kgHrana - obshtaHrana);
            System.out.printf("%.0f kilos of food left.",ostavat);
        } else if (obshtaHrana > kgHrana){
            double nedostigat = Math.ceil(obshtaHrana - kgHrana);
            System.out.printf("%.0f more kilos of food are needed.",nedostigat);
        }
    }
}
