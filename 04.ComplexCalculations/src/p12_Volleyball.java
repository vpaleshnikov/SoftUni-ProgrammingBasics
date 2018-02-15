import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String godina = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double sybotniIgri = (48 - h) * 3.0 / 4;
        double prazniciIgri = p * 2.0 / 3;
        double obshtoIgriPrezWeekendiIPraznici = sybotniIgri + h + prazniciIgri;

        if (godina.equals("normal")) {
            System.out.printf("%.0f",Math.floor(obshtoIgriPrezWeekendiIPraznici));
        }
        else if (godina.equals("leap")) {
            double dopalnitelniIgri = obshtoIgriPrezWeekendiIPraznici * 0.15;
            double obshtoIgri = dopalnitelniIgri + obshtoIgriPrezWeekendiIPraznici;
            System.out.printf("%.0f",Math.floor(obshtoIgri));
        }
    }
}