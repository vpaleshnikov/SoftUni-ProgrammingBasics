import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem01_RepairingTheTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int o = Integer.parseInt(scanner.nextLine());

        DecimalFormat format = new DecimalFormat("###.###########");

        int area = n * n;
        int benchArea = m * o;
        int coverArea = area - benchArea;
        double tilesArea = w * l;
        double tilesNeeded = coverArea / tilesArea;
        double timeNeeded = tilesNeeded * 0.2;

        System.out.printf("%f%n",tilesNeeded);
        System.out.printf("%f%n",timeNeeded);
    }
}