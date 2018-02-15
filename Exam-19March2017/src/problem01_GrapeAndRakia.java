import java.util.Scanner;

public class problem01_GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ploshtNaLozeto = Double.parseDouble(scanner.nextLine());
        double kgOtKvadratenMetar = Double.parseDouble(scanner.nextLine());
        double brak = Double.parseDouble(scanner.nextLine());

        double kgGrozde = ploshtNaLozeto * kgOtKvadratenMetar;
        double brakGrozde = kgGrozde - brak;

        double zaRakiq = brakGrozde * 0.45;
        double litri = zaRakiq / 7.5;
        double prihodRakiq = litri * 9.80;

        double zaProdan = brakGrozde * 0.55;
        double prihodGrozde = zaProdan * 1.50;;

        System.out.printf("%.2f%n",prihodRakiq);
        System.out.printf("%.2f",prihodGrozde);
    }
}
