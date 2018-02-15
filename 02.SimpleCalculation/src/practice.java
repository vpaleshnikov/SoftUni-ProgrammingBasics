import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dyljina = Double.parseDouble(scanner.nextLine());
        dyljina = dyljina * 100;
        double shirina = Double.parseDouble(scanner.nextLine());
        shirina = shirina * 100;
        double koridor = shirina - 100;
        double red = Math.floor(dyljina / 120);
        double biura = Math.floor(koridor / 70);
        double mesta = (red * biura) - 3;
        System.out.println(mesta);
    }
}
