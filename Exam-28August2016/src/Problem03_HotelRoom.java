import java.util.Scanner;

public class Problem03_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioMayOctober = 50.00;
        double studioJuneSeptember = 75.20;
        double studioJulyAugust = 76.00;

        double apartmentMayOctober = 65.00;
        double apartmentJuneSeptember = 68.70;
        double apartmetnJulyAugust = 77.00;

        if (month.equals("may") || month.equals("october")){
            if (nights > 14){
                double priceApartment = nights * (apartmentMayOctober - (apartmentMayOctober * 0.10));
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            } else {
                double priceApartment = nights * apartmentMayOctober;
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            }
            if (nights > 7 && nights <= 13){
                double priceStudio = nights * (studioMayOctober - (studioMayOctober * 0.05));
                System.out.printf("Studio: %.2f lv.%n",priceStudio);
            } else if (nights > 14){
                double priceStudio = nights * (studioMayOctober - (studioMayOctober * 0.30));
                System.out.printf("Studio: %.2f lv.%n",priceStudio);
            } else {
                double priceStudio = nights * studioMayOctober;
                System.out.printf("Studio: %.2f lv.%n",priceStudio);
            }
        }
        if (month.equals("june") || month.equals("september")){
            if (nights > 14){
                double priceApartment = nights * (apartmentJuneSeptember - (apartmentJuneSeptember * 0.10));
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            } else {
                double priceApartment = nights * (apartmentJuneSeptember);
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            }
            if (nights > 14){
                double priceStudio = nights * (studioJuneSeptember - (studioJuneSeptember * 0.20));
                System.out.printf("Studio: %.2f lv.%n",priceStudio);
            } else {
                double priceStudio = nights * (studioJuneSeptember);
                System.out.printf("Studio: %.2f lv.%n",priceStudio);
            }
        }
        if (month.equals("july")|| month.equals("august")){
            if (nights > 14){
                double priceApartment = nights * (apartmetnJulyAugust - (apartmetnJulyAugust * 0.10));
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            } else {
                double priceApartment = nights * (apartmetnJulyAugust);
                System.out.printf("Apartment: %.2f lv.%n",priceApartment);
            }
            double priceStudio = nights * studioJulyAugust;
            System.out.printf("Studio: %.2f lv.%n",priceStudio);
        }
    }
}
