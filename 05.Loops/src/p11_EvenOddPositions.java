import java.text.DecimalFormat;
import java.util.Scanner;
public class p11_EvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        DecimalFormat format = new DecimalFormat("#.###############");
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            } else {
                oddSum = oddSum + num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            }
        }
        System.out.printf("oddSum=%s%n",format.format(oddSum));
        if (oddMin == 1000000000.0 && oddMax == -1000000000.0) {
            System.out.println("oddMin=No");
            System.out.println("oddMax=No");
        } else if (oddMax == -1000000000.0) {
            System.out.printf("oddMin=%s%n",format.format(oddMin));
            System.out.printf("oddMax=%s%n",format.format(oddMax));
        } else {
            System.out.printf("oddMin=%s%n",format.format(oddMin));
            System.out.printf("oddMax=%s%n",format.format(oddMax));
        }
        System.out.printf("evenSum=%s%n",format.format(evenSum));
        if (evenMin == 1000000000.0 && evenMax == -1000000000.0) {
            System.out.println("evenMin=No");
            System.out.println("evenMax=No");
        } else if (evenMax == -1000000000.0) {
            System.out.printf("evenMin=%s%n",format.format(evenMin));
            System.out.printf("evenMax=%s%n",format.format(evenMax));
        } else {
            System.out.printf("evenMin=%s%n",format.format(evenMin));
            System.out.printf("evenMax=%s%n",format.format(evenMax));
        }
    }
}