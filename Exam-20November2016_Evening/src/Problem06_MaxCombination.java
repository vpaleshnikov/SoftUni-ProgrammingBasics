import java.util.Scanner;

public class Problem06_MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int maxCombos = Integer.parseInt(scanner.nextLine());
        int combos = 0;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                combos++;
                System.out.printf("<%d-%d>",i,j);
                if (combos == maxCombos){
                    break;
                }
            }
            if (combos == maxCombos){
                break;
            }
        }
    }
}
