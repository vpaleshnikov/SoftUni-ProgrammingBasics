import java.util.Scanner;

public class p13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(num + " ");
                num++;
                if (num > n){
                    return;
                }
            }
            System.out.println();
        }
    }
}


