import java.util.Scanner;

public class Problem03_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biudjet = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine().toLowerCase();

        double economyLqtoKabrio = biudjet * 0.35;
        double economyZimaDjip = biudjet * 0.65;
        double compactLqtoKabrio = biudjet * 0.45;
        double compactZimaDjip = biudjet * 0.80;
        double luxuryDjip = biudjet * 0.90;

        boolean economy = biudjet <= 100;
        boolean compact = biudjet > 100 && biudjet <= 500;
        boolean luxury = biudjet > 500;

        if (economy) {
            if (sezon.equals("summer")) {
                double cena = economyLqtoKabrio;
                System.out.println("Economy class");
                System.out.printf("Cabrio - %.2f", cena);
            } else if (sezon.equals("winter")) {
                double cena = economyZimaDjip;
                System.out.println("Economy class");
                System.out.printf("Jeep - %.2f", cena);
            }
        } else if (compact) {
            if (sezon.equals("summer")) {
                double cena = compactLqtoKabrio;
                System.out.println("Compact class");
                System.out.printf("Cabrio - %.2f", cena);
            } else if (sezon.equals("winter")) {
                double cena = compactZimaDjip;
                System.out.println("Compact class");
                System.out.printf("Jeep - %.2f", cena);
            }
        } else if (luxury) {
            if (sezon.equals("summer")) {
                double cena = luxuryDjip;
                System.out.println("Luxury class");
                System.out.printf("Jeep - %.2f", cena);
            } else if (sezon.equals("winter")) {
                double cena = luxuryDjip;
                System.out.println("Luxury class");
                System.out.printf("Jeep - %.2f", cena);
            }
        }
    }
}
