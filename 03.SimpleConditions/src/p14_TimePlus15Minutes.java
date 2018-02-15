import java.util.Scanner;

public class p14_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biudjet = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine().toLowerCase();

        double bulgariaLqtoCamp = biudjet * 0.3;
        double bulgariqZima = biudjet * 0.7;
        double balkaniLqtoCamp = biudjet * 0.4;
        double balkaniZima = biudjet * 0.8;
        double evropa = biudjet * 0.9;

        if (biudjet <= 100 && sezon.equals("summer")) {
            String destinaciq = "Bulgaria";
            String vidPochivka = "Camp";
            double poharchenaSuma = bulgariaLqtoCamp;
            System.out.printf("Somewhere in %s %n%s - %.2f",destinaciq,vidPochivka,poharchenaSuma);
        } else if (biudjet <= 100 && sezon.equals("winter")) {
            String destinaciq = "Bugaria";
            String vidPochivka = "Hotel";
            double poharchenaSuma = bulgariqZima;
            System.out.printf("Somewhere in %s %n%s - %.2f",destinaciq,vidPochivka,poharchenaSuma);
        }
        if (biudjet > 101 %% biudjet <= 1000 %% sezon.equals("summer")){
            String destinaciq = "Balkans";
            String vidPochivka = "Camp";
            double poharchenaSuma = balkaniLqtoCamp;
            System.out.printf("Somewhere in %s %n%s - %.2f",destinaciq,vidPochivka,poharchenaSuma);

        }
        }
    }