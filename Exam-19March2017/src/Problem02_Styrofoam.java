import java.util.Scanner;

public class Problem02_Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double biudjet = Double.parseDouble(scanner.nextLine());
        double ploshtNaKyshtata = Double.parseDouble(scanner.nextLine());
        double broiProzorci = Double.parseDouble(scanner.nextLine());
        double kvMetriStiroporV1Paket = Double.parseDouble(scanner.nextLine());
        double cena1paketStiropor = Double.parseDouble(scanner.nextLine());

        double ploshtNaKyshtataBezBroiProzorci = ploshtNaKyshtata - (broiProzorci * 2.4);
        double fira = ploshtNaKyshtataBezBroiProzorci + (ploshtNaKyshtataBezBroiProzorci * 0.1);
        double nujniPaketi = Math.ceil(fira / kvMetriStiroporV1Paket);
        double cenaNujniPaketi = nujniPaketi * cena1paketStiropor;

        double spent = cenaNujniPaketi;
        double left = Math.abs(biudjet - spent);
        double needMore = Math.abs(biudjet - spent);


        if (biudjet > cenaNujniPaketi){
            System.out.printf("Spent: %.2f%n",spent);
            System.out.printf("Left: %.2f",left);
        } else if (biudjet < cenaNujniPaketi){
            System.out.printf("Need more: %.2f",needMore);
        }


    }
}
