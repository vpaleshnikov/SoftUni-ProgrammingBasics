import java.util.Scanner;

public class Problem03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biudjet = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine().toLowerCase();

        double campLqtoAlqska = biudjet * 0.65;
        double campZimaMaroko = biudjet * 0.45;
        double hutLqtoAlqska = biudjet * 0.80;
        double hutZimaMaroko = biudjet * 0.60;
        double hotel = biudjet * 0.90;

        if (biudjet <= 1000){
            if (sezon.equals("summer")){
                double cena = campLqtoAlqska;
                System.out.printf("Alaska - Camp - %.2f",cena);
            } else if (sezon.equals("winter")){
                double cena = campZimaMaroko;
                System.out.printf("Morocco - Camp - %.2f",cena);
            }
        } else if (biudjet > 1000 && biudjet <= 3000){
            if (sezon.equals("summer")){
                double cena = hutLqtoAlqska;
                System.out.printf("Alaska - Hut - %.2f",cena);
            } else if (sezon.equals("winter")){
                double cena = hutZimaMaroko;
                System.out.printf("Morocco - Hut - %.2f",cena);
            }
        } else if (biudjet > 3000){
            if (sezon.equals("summer")){
                double cena = hotel;
                System.out.printf("Alaska - Hotel - %.2f",cena);
            } else if (sezon.equals("winter")){
                double cena = hotel;
                System.out.printf("Morocco - Hotel - %.2f",cena);
            }
        }
    }
}
