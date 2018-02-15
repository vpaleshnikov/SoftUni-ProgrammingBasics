import java.util.Scanner;
public class p12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int maxDiff = Integer.MIN_VALUE;
        boolean equal = true;

        for (int i = 0; i < n; i++) {
            int fNum = Integer.parseInt(scanner.nextLine());
            int sNum = Integer.parseInt(scanner.nextLine());
            sum1 = fNum + sNum;
            if (i > 0 && sum1 != sum2){
                equal = false;
                int diff = Math.abs(sum1 - sum2);
                if (diff > maxDiff){
                    maxDiff = diff;
                }
            }
            sum2 = sum1;
        }
        if (equal){
            System.out.printf("Yes, value=%d%n",sum1);
        } else {
            System.out.printf("No, maxdiff=%d%n",maxDiff);
        }
    }
}