import java.util.Scanner;

public class Problem02_Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chashi = Double.parseDouble(scanner.nextLine());
        double rabotnici = Double.parseDouble(scanner.nextLine());
        double rabDni = Double.parseDouble(scanner.nextLine());

        double rabChasa = rabotnici * rabDni * 8;
        double izraboteniChashi = Math.floor(rabChasa / 5);

        double zagubi = chashi - izraboteniChashi;
        double zagubiLV = zagubi * 4.20;

        double pechalbi = izraboteniChashi - chashi;
        double pechalbiLV = pechalbi * 4.20;

        if (chashi > izraboteniChashi){
            System.out.printf("Losses: %.2f",zagubiLV);
        } else if (izraboteniChashi >= chashi){
            System.out.printf("%.2f extra money",pechalbiLV);
        }
    }
}
