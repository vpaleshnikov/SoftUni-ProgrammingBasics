import java.util.Scanner;

public class Problem04_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broiHodove = Integer.parseInt(scanner.nextLine());
        int n = 0;
        double n1 = 0.0;
        double n2 = 0.0;
        double n3 = 0.0;
        double n4 = 0.0;
        double n5 = 0.0;
        double n6 = 0.0;
        double points = 0.0;

        for (int i = 0; i < broiHodove; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            n++;
            points = points;
            if (num >= 0 && num < 10){
                n1++;
                points += (num * 0.2);
            }
            if (num >= 10 && num < 20){
                n2++;
                points += (num * 0.3);
            }
            if (num >= 20 && num < 30){
                n3++;
                points += (num * 0.4);
            }
            if (num >= 30 && num < 40){
                n4++;
                points = points + 50;
            }
            if (num >= 40 && num <= 50){
                n5++;
                points = points + 100;
            }
            if (num < 0 || num > 50){
                n6++;
                points = points / 2;
            }
        }
        n1 = (n1 / n) * 100;
        n2 = (n2 / n) * 100;
        n3 = (n3 / n) * 100;
        n4 = (n4 / n) * 100;
        n5 = (n5 / n) * 100;
        n6 = (n6 / n) * 100;
        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n",n1);
        System.out.printf("From 10 to 19: %.2f%%%n",n2);
        System.out.printf("From 20 to 29: %.2f%%%n",n3);
        System.out.printf("From 30 to 39: %.2f%%%n",n4);
        System.out.printf("From 40 to 50: %.2f%%%n",n5);
        System.out.printf("Invalid numbers: %.2f%%%n",n6);
    }
}
