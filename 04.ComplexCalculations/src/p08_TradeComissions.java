import java.util.Scanner;

public class p08_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = -1.0;

        if (town.equals("sofia")){
            if (sales >= 0 && sales <= 500) commission = 0.05;
             else if (sales > 500 && sales <= 1000) commission = 0.07;
             else if (sales > 1000 && sales <= 10000) commission = 0.08;
             else if (sales > 10000) commission = 0.12;
        } else if (town.equals("varna")){
            if (sales >= 0 && sales <= 500) commission = 0.045;
            else if (sales  > 500 && sales <= 1000) commission = 0.075;
            else if (sales > 1000 && sales <= 10000) commission = 0.1;
            else if (sales > 10000) commission = 0.13;
        } else if (town.equals("plovdiv")){
            if (sales >= 0 && sales <= 500) commission = 0.055;
            else if (sales >= 500 && sales <= 1000) commission = 0.08;
            else if (sales >= 1000 && sales <= 10000) commission = 0.12;
            else if (sales > 10000) commission = 0.145;
        }
        if (commission >= 0){
            System.out.printf("%.2f", sales * commission);
        } else {
            System.out.println("error");
        }
    }
}
