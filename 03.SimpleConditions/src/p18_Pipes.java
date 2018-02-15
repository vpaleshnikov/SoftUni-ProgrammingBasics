import java.text.DecimalFormat;
import java.util.Scanner;

public class p18_Pipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p1water = p1 * h;
        double p2water = p2 * h;
        double water = p1water + p2water;
        DecimalFormat format = new DecimalFormat("#.###############");
        if (water <= v){
            double full = (water / v) * 100;
            double p1percent = (p1water / water) * 100;
            double p2percent = (p2water / water) * 100;
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    Math.floor(full),
                    Math.floor(p1percent),
                    Math.floor(p2percent));
        } else {
            double full = water - v;
            System.out.printf("For %s hours the pool overflows with %s liters.",format.format(h),format.format(full));
        }
    }
}
