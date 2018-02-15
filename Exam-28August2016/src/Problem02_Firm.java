import java.util.Scanner;

public class Problem02_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int overtimeWorkers = Integer.parseInt(scanner.nextLine());

        double training = days - (days * 0.10);
        double trainingHours = training * 8;
        double overtimeHours = overtimeWorkers * (2 * days);
        double allHours = Math.floor(trainingHours + overtimeHours);

        if (hours <= allHours){
            double left = Math.abs(hours - allHours);
            System.out.printf("Yes!%.0f hours left.%n",left);
        } else {
            double notEnough = Math.abs(hours - allHours);
            System.out.printf("Not enough time!%.0f hours needed.%n",notEnough);
        }
    }
}
