import java.util.Scanner;

public class Problem01_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double dveteStrani = a * (a / 2) * 2;
        double kvadrat = (a / 2) * (a / 2);
        double triangle = ((a / 2) * (b - a / 2)) / 2;
        double zadnaStena = kvadrat + triangle;
        double vhod = (a / 5) * (a / 5);
        double prednaStena = zadnaStena - vhod;
        double obshtaPlosht = dveteStrani + zadnaStena + prednaStena;
        double zelenaBoq = obshtaPlosht / 3;
        double pokriv = a * (a / 2) * 2;
        double chervenaBoq = pokriv / 5;

        System.out.printf("%.2f%n",zelenaBoq);
        System.out.printf("%.2f",chervenaBoq);
    }
}
