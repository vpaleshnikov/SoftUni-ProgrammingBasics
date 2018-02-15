import java.util.Scanner;

public class Problem03_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine().toLowerCase();

        double juniorsTrailTax = 5.50;
        double juniorsCrossCountryTax = 8;
        double juniorsDownhillTax = 12.25;
        double juniorsRoadTax = 20;
        double seniorsTrailTax = 7;
        double seniorsCrossCountryTax = 9.50;
        double seniorsDownhillTax = 13.75;
        double seniorsRoadTax = 21.50;

        boolean over50 = juniors + seniors >= 50;

        if (trace.equals("trail")){
            double sum = (juniors * juniorsTrailTax) +
                    (seniors * seniorsTrailTax);
            double cost = sum * 0.05;
            double left = sum - cost;
            System.out.printf("%.2f",left);
        } else if (trace.equals("cross-country")){
            if (over50){
                double sum = ((juniors) * (juniorsCrossCountryTax - (juniorsCrossCountryTax * 0.25))) +
                        (seniors * (seniorsCrossCountryTax - (seniorsCrossCountryTax * 0.25)));
                double cost = sum * 0.05;
                double left = sum - cost;
                System.out.printf("%.2f",left);
            } else {
                double sum = (juniors * juniorsCrossCountryTax) +
                        (seniors * seniorsCrossCountryTax);
                double cost = sum * 0.05;
                double left = sum - cost;
                System.out.printf("%.2f",left);
            }
        } else if (trace.equals("downhill")){
            double sum = (juniors * juniorsDownhillTax) +
                    (seniors * seniorsDownhillTax);
            double cost = sum * 0.05;
            double left = sum - cost;
            System.out.printf("%.2f",left);
        } else if (trace.equals("road")){
            double sum = (juniors * juniorsRoadTax) +
                    (seniors * seniorsRoadTax);
            double cost = sum * 0.05;
            double left = sum - cost;
            System.out.printf("%.2f",left);
        }
    }
}
