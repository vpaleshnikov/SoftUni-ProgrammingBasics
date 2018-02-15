import java.util.Scanner;

public class problem03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broiHrizantemi = Integer.parseInt(scanner.nextLine());
        int broiRozi = Integer.parseInt(scanner.nextLine());
        int broiLaleta = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine().toLowerCase();
        String praznik = scanner.nextLine().toLowerCase();
        int cenaAranjiraneNaBuketa = 2;

        double cenaHrizantemiProletLqto = 2.00;
        double cenaRoziProletLqto = 4.10;
        double cenaLaletaProletLqto = 2.50;
        double cenaHrizantemiEsenZima = 3.75;
        double cenaRoziEsenZima = 4.50;
        double cenaLaletaEsenZima = 4.15;
        double buket = broiHrizantemi + broiRozi + broiLaleta;
        double price = 0;

        if (sezon.equals("spring") || sezon.equals("summer")){
            price = (broiHrizantemi * cenaHrizantemiProletLqto) +
                    (broiRozi * cenaRoziProletLqto)+
                    (broiLaleta * cenaLaletaProletLqto);
            if (praznik.equals("y")){
                price = price + (price * 0.15);
            } else if (praznik.equals("n")){
                price = price;
            }
        }
        if (sezon.equals("autumn") || sezon.equals("winter")){
            price = (broiHrizantemi * cenaHrizantemiEsenZima) +
                    (broiRozi * cenaRoziEsenZima) +
                    (broiLaleta * cenaLaletaEsenZima);
            if (praznik.equals("y")){
                price = price + (price * 0.15);
            } else if (praznik.equals("n")){
                price = price;
            }
        }
        if (broiLaleta > 7 && sezon.equals("spring") ||
                broiLaleta > 7 && sezon.equals("summer")){
            price = price - (price * 0.05);
        } else {
            price = price;
        }
        if (broiRozi >= 10 && sezon.equals("autumn") ||
                broiRozi >= 10 && sezon.equals("winter")) {
            price = price - (price * 0.10);
        } else {
            price = price;
        }
        if (buket > 20) {
            price = price - (price * 0.20);
        } else {
            price = price;
        }
        price = price + cenaAranjiraneNaBuketa;
        System.out.printf("%.2f",price);
    }
}
