import java.util.Scanner;

public class Problem04_SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grupi = Integer.parseInt(scanner.nextLine());
        double vsHora = 0;
        int kola = 0;
        int mikrobus = 0;
        int malakAvtobus = 0;
        int golqmAvtobus = 0;
        int vlak = 0;


        for (int i = 0; i < grupi; i++) {
            int hora = Integer.parseInt(scanner.nextLine());
            vsHora = vsHora + hora;

            if (hora > 0 && hora <= 5){
                kola = kola + hora;
            } else if (hora > 5 && hora <= 12){
                mikrobus = mikrobus + hora;
            } else if (hora > 12 && hora <= 25){
                malakAvtobus = malakAvtobus + hora;
            } else if (hora > 25 && hora <= 40){
                golqmAvtobus = golqmAvtobus + hora;
            } else if (hora > 40){
                vlak = vlak + hora;
            }
        }
        System.out.printf("%.2f%%%n", kola / vsHora * 100);
        System.out.printf("%.2f%%%n", mikrobus / vsHora * 100);
        System.out.printf("%.2f%%%n", malakAvtobus / vsHora * 100);
        System.out.printf("%.2f%%%n", golqmAvtobus / vsHora * 100);
        System.out.printf("%.2f%%", vlak / vsHora * 100);
    }
}
