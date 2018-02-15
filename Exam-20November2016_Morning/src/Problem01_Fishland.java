import java.util.Scanner;

public class Problem01_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cenaSkumriq = Double.parseDouble(scanner.nextLine());
        double cenaCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double cenaPalamud = cenaSkumriq + (cenaSkumriq * 0.60);
        double sumaPalamud = kgPalamud * cenaPalamud;
        double cenaSafrid = cenaCaca + (cenaCaca * 0.80);
        double sumaSafrid = kgSafrid * cenaSafrid;
        double cenaMidi = kgMidi * 7.50;
        double smetka = sumaPalamud + sumaSafrid + cenaMidi;

        System.out.printf("%.2f",smetka);

    }
}
