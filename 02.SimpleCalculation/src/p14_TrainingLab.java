import java.util.Scanner;

public class p14_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        h = h * 100;
        w = w * 100;
        double lenghtWorkPlace = Math.floor((w-100) / 70);
        double widhtWorkPlae = Math.floor(h/120);
        double result = ((lenghtWorkPlace * widhtWorkPlae) - 3);
        System.out.println(result);
    }
}
