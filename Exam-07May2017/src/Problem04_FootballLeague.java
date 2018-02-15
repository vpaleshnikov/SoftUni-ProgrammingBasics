import java.util.Scanner;

public class Problem04_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double fans = Integer.parseInt(scanner.nextLine());

        double fansA = 0;
        double fansB = 0;
        double fansV = 0;
        double fansG = 0;

        for (int i = 1; i <= fans ; i++) {
            String sector = scanner.nextLine().toLowerCase();
            if (sector.equals("a")){
                fansA++;
            }
            if (sector.equals("b")){
                fansB++;
            }
            if (sector.equals("v")){
                fansV++;
            }
            if (sector.equals("g")){
                fansG++;
            }
        }
        double fansAPercent = (fansA * 100) / fans;
        double fansBPercent = (fansB * 100) / fans;
        double fansVPercent = (fansV * 100) / fans;
        double fansGPercent = (fansG * 100) / fans;
        double fansPercent = (fans * 100) / stadiumCapacity;
        System.out.printf("%.2f%%%n",fansAPercent);
        System.out.printf("%.2f%%%n",fansBPercent);
        System.out.printf("%.2f%%%n",fansVPercent);
        System.out.printf("%.2f%%%n",fansGPercent);
        System.out.printf("%.2f%%%n",fansPercent);

    }
}
