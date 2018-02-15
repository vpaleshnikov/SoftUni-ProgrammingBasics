import java.util.Scanner;

public class Problem02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - daysOff;
        int playTime = (workDays * 63)+(daysOff * 127);
        int diff = Math.abs(30000 - playTime);

        int hours = diff / 60;
        int minutes = diff % 60;

        if (playTime <= 30000){
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play%n",hours,minutes);
        } else if (playTime > 30000){
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play%n",hours,minutes);
        }
    }
}
