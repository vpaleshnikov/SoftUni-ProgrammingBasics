import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerPokemons = Integer.parseInt(scanner.nextLine());
        int secondPlayerPokemons = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());
        int battles = 0;

        for (int i = 1; i <= firstPlayerPokemons ; i++) {
            for (int j = 1; j <= secondPlayerPokemons ; j++) {
                System.out.printf("(%d <-> %d) ",i,j);
                battles++;
                if (battles == maxBattles){
                    break;
                }
            }
            if (battles == maxBattles){
                break;
            }
        }
    }
}
