import java.util.Scanner;

public class Problem03_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sezon = scanner.nextLine().toLowerCase();
        double kmMesec = Double.parseDouble(scanner.nextLine());

        double cenaKmMesecProletEsenPod5000 = 0.75;
        double cenaKmMesecLqtoPod5000 = 0.90;
        double cenaKmMesecZimaPod5000 = 1.05;

        double cenaKmMesecProletEsenMejdu5000i10000 = 0.95;
        double cenaKmMesecLqtoMejdu5000i10000 = 1.10;
        double cenaKmMesecZimaMejdu5000i10000 = 1.25;

        double cenaKmMejdu10000i20000 = 1.45;

        if (sezon.equals("spring") || sezon.equals("autumn")) {
            if (kmMesec <= 5000) {
                double zaplata = (kmMesec * cenaKmMesecProletEsenPod5000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 5000 && kmMesec <= 10000) {
                double zaplata = (kmMesec * cenaKmMesecProletEsenMejdu5000i10000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 10000 && kmMesec <= 20000) {
                double zaplata = (kmMesec * cenaKmMejdu10000i20000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            }
        } else if (sezon.equals("summer")) {
            if (kmMesec <= 5000) {
                double zaplata = (kmMesec * cenaKmMesecLqtoPod5000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 5000 && kmMesec <= 10000) {
                double zaplata = (kmMesec * cenaKmMesecLqtoMejdu5000i10000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 10000 && kmMesec <= 20000) {
                double zaplata = (kmMesec * cenaKmMejdu10000i20000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            }
        } else if (sezon.equals("winter")) {
            if (kmMesec <= 5000) {
                double zaplata = (kmMesec * cenaKmMesecZimaPod5000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 5000 && kmMesec <= 10000) {
                double zaplata = (kmMesec * cenaKmMesecZimaMejdu5000i10000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            } else if (kmMesec > 10000 && kmMesec <= 20000) {
                double zaplata = (kmMesec * cenaKmMejdu10000i20000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            }
        } else if (kmMesec > 10000 && kmMesec <= 20000) {
                double zaplata = (kmMesec * cenaKmMejdu10000i20000) * 4;
                double zaplataSledDanaci = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", zaplataSledDanaci);
            }
        }
    }