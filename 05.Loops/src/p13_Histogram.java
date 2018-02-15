import java.util.Scanner;

public class p13_Histogram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            double p1 = 0;
            double p2 = 0;
            double p3 = 0;
            double p4 = 0;
            double p5 = 0;
            double p = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                ++p;
                if (num >= 800){
                    ++p5;
                } else if (num >= 600){
                    p4++;
                } else if (num >= 400){
                    p3++;
                } else if (num >= 200){
                    p2++;
                } else {
                    p1++;
                }
            }
            System.out.printf("%.2f%n",100 * p1 / p);
            System.out.printf("%.2f%n",100 * p2 / p);
            System.out.printf("%.2f%n",100 * p3 / p);
            System.out.printf("%.2f%n",100 * p4 / p);
            System.out.printf("%.2f%n",100 * p5 / p);
        }
    }