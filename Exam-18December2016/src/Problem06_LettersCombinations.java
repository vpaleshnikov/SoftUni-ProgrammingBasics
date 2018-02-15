import java.util.Scanner;

public class Problem06_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        int position = 0;

        for (char i = a; i <= b; i++) {
           if (i == c){
               continue;
           }
            for (char j = a; j <= b; j++) {
               if (j == c){
                   continue;
               }
                for (char k = a; k <= b; k++) {
                   if (k == c){
                       continue;
                   }
                    position++;
                    System.out.printf("%c%c%c ",i,j,k);
                }
            }
        }
        System.out.println(position);
    }
}