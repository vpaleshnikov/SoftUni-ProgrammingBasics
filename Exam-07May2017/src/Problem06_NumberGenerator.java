import java.util.Scanner;

public class Problem06_NumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specialN = Integer.parseInt(scanner.nextLine());
        int controlN = Integer.parseInt(scanner.nextLine());
        int num = 0;

        for (int i = m; i >= 1 ; i--) {
            for (int j = n; j >= 1 ; j--) {
                for (int k = l; k >= 1 ; k--) {
                    num = (i * 100) + (j * 10) + k;
                    if (num % 3 == 0) {
                        specialN += 5;
                    } else if (num % 10 == 5) {
                        specialN -= 2;
                    } else if (num % 2 == 0) {
                        specialN *= 2;
                    }
                    if (specialN >= controlN){
                        break;
                    }
                }
                if (specialN >= controlN){
                    break;
                }
            }
            if (specialN >= controlN){
                break;
            }
        }
        if (specialN >= controlN){
            System.out.printf("Yes! Control number was reached! Current special number is %d.%n",specialN);
        } else {
            System.out.printf("No! %d is the last reached special number.%n",specialN);
        }
    }
}
