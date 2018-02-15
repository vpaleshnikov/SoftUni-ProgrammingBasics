import java.util.Scanner;

public class problem01_Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        double firstTimeMin = Double.parseDouble(scanner.nextLine());
        firstTimeMin = firstTimeMin / 60;
        double secondTimeMin = Double.parseDouble(scanner.nextLine());
        secondTimeMin = secondTimeMin / 60;
        double thirdTimeMin = Double.parseDouble(scanner.nextLine());
        thirdTimeMin = thirdTimeMin / 60;
        double razstoqniePyrvonachanlnaSkorost = km * (firstTimeMin);
        double speedingUp = km + (km * 0.1);
        double afterSpeedingUp = speedingUp * (secondTimeMin);
        double slowingDown = speedingUp - (speedingUp * 0.05);
        double afterSlowingDown = slowingDown * (thirdTimeMin);
        double result = razstoqniePyrvonachanlnaSkorost +
                afterSlowingDown +
                afterSpeedingUp;
        System.out.printf("%.2f",result);


    }
}
