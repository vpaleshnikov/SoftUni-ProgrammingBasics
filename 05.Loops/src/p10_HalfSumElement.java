import java.util.Scanner;

public class p10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currNum;
            if (currNum > max){
                max = currNum;
            }
        }
        sum = sum - max;
        int diff = Math.abs(max - sum);
        if (diff == 0){
            System.out.printf("Yes%nSum = %d",sum);
        } else {
            System.out.printf("No%nDiff = %d",diff);
        }
    }
}
