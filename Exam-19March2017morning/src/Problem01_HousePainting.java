import java.util.Scanner;

public class Problem01_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double stranichnaStenaPlosht = x * y;
        double ploshtProzorec = 1.5 * 1.5;
        double dveteStranici = (2 * stranichnaStenaPlosht) - (2 * ploshtProzorec);
        double zadnaStena = x * x;
        double vhod = 1.2 * 2;
        double prednaZadna = (2 * zadnaStena) - vhod;
        double zelenaObshtaPlosht = dveteStranici + prednaZadna;
        double zelenaBoq = zelenaObshtaPlosht / 3.4;

        double dvataPravoygylnikaNaPokriva = 2 * (stranichnaStenaPlosht);
        double dvataTriygylnika = 2 * ((x * h) / 2);
        double chervenaObshtaPlosht = dvataPravoygylnikaNaPokriva + dvataTriygylnika;
        double chervenaBoq = chervenaObshtaPlosht / 4.3;


        System.out.printf("%.2f%n",zelenaBoq);
        System.out.printf("%.2f",chervenaBoq);
    }
}
