import java.util.Scanner;

public class p17_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String tariff = scanner.nextLine().toLowerCase();
        double taxiStart = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double bus = 0.09;
        double train = 0.06;
        if (km < 20 && tariff.equals("day")){
            System.out.println((km*taxiDay) + taxiStart);
        } else if (km < 20 && tariff.equals("night")){
            System.out.println((km*taxiNight) + taxiStart);
        } else if (km >= 20 && km < 100){
            System.out.println(km*bus);
        } else if (km >= 100){
            System.out.println(km*train);
        }
    }
}

