import java.util.Scanner;

public class Problem03_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine().toLowerCase();
        int pplCount = Integer.parseInt(scanner.nextLine());

        double normal = 249.99;
        double vip = 499.99;
        double transportFee = 0;
        double ticket = 0;

        if (pplCount >= 1 && pplCount < 5){
            transportFee = salary * 0.75;
        } else if (pplCount >= 5 && pplCount < 10){
            transportFee = salary * 0.60;
        } else if (pplCount >= 10 && pplCount < 25){
            transportFee = salary * 0.50;
        } else if (pplCount >= 25 && pplCount < 50){
            transportFee = salary * 0.40;
        } else if (pplCount >= 50){
            transportFee = salary * 0.25;
        }

        salary = salary - transportFee;

        if (category.equals("normal")){
            ticket = pplCount * normal;
        } else if (category.equals("vip")){
            ticket = pplCount * vip;
        }

        if (ticket < salary){
            double left = Math.abs(ticket - salary);
            System.out.printf("Yes! You have %.2f leva left.",left);
        } else if (ticket > salary){
            double notEnough = Math.abs(ticket - salary);
            System.out.printf("Not enough money! You need %.2f leva.",notEnough);
        }
    }
}
