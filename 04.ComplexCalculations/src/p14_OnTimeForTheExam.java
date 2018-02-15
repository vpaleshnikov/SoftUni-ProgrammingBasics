import java.util.Scanner;

public class p14_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chasNaIzpita = Integer.parseInt(scanner.nextLine());
        int minutiNaIzpita = Integer.parseInt(scanner.nextLine());
        int chasNaPristigane = Integer.parseInt(scanner.nextLine());
        int minutaNaPristigane = Integer.parseInt(scanner.nextLine());

        int obshtoMinutiNaIzpita = chasNaIzpita * 60 + minutiNaIzpita;
        int obshtoMinutiNaPristigane = chasNaPristigane * 60 + minutaNaPristigane;
        int razlikaVMinutite = obshtoMinutiNaIzpita - obshtoMinutiNaPristigane;

        int chasove = Math.abs(razlikaVMinutite / 60);
        int minuti = Math.abs(razlikaVMinutite % 60);

        boolean onTime = razlikaVMinutite == 0;
        boolean onTime2 = razlikaVMinutite > 0;
        boolean onTime3 = razlikaVMinutite <= 30;
        boolean early = razlikaVMinutite > 30;

        if (onTime || onTime2 && onTime3) {
            System.out.println("On time");
            if (razlikaVMinutite != 0) {
                System.out.printf("%d minutes before the start", minuti);
            }
        } else if (early) {
            System.out.println("Early");
            if (razlikaVMinutite < 60) {
                System.out.printf("%d minutes before the start", minuti);
            } else if (razlikaVMinutite >= 60) {
                if (minuti < 10) {
                    System.out.printf("%d:0%d hours before the start", chasove, minuti);
                } else {
                    System.out.printf("%d:%d hours before the start", chasove, minuti);
                }
            }
        } else {
            System.out.println("Late");
            razlikaVMinutite = Math.abs(razlikaVMinutite);
            if (razlikaVMinutite < 60) {
                System.out.printf("%d minutes after the start", minuti);
            }  else if (razlikaVMinutite > 60) {
                if (minuti < 10) {
                    System.out.printf("%d:0%d hours after the start", chasove, minuti);
                } else {
                    System.out.printf("%d:%d hours after the start", chasove, minuti);
                }
            }
        }
    }
}
