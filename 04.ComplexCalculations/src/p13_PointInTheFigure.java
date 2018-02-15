import java.util.Scanner;

public class p13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if ((x >= 0) && (x <= 3 * h) && (y >= 0) && (y <= h)) {
            if ((x > 0) && (x < 3 * h) && (y > 0) && (y < h)) {
                System.out.println("Inside");
            } else if ((x > h) && (x < 2 * h) && (y == h)) {
                System.out.println("Inside");
            } else {
                System.out.println("Border");
            }
        } else if ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h)) {
            if ((x > h) && (x < 2 * h) && (y > h) && (y < 4 * h)) {
                System.out.println("Inside");
            } else if ((x > h) && (x < 2 * h) && (y == h)) {
                System.out.println("Inside");
            } else {
                System.out.println("Border");
            }
        } else {
            System.out.println("Outside");
        }
    }
}
