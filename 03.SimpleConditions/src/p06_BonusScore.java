import java.util.Scanner;

public class p06_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");


        int number = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;

        if (number <= 100){
            bonusScore = bonusScore + 5;
        } else if (number < 1000){
            bonusScore = number * 0.2;
        } else if (number > 100){
            bonusScore = number * 0.1;
        }

        if (number % 2 == 0){
            bonusScore = bonusScore + 1;
        } else if (number % 10 == 5){
            bonusScore = bonusScore + 2;
        }
        System.out.println("Bonus score: " + bonusScore);
        System.out.println("Total score: " + (bonusScore + number));
    }
}
