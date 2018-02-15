import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine().toLowerCase();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double result = r * c;

       if (projection.equals("premiere")){
           result = result * 12.00;
           System.out.printf("%.2f leva",result);
       } else if (projection.equals("normal")){
           result = result * 7.50;
           System.out.printf("%.2f leva",result);
       } else if (projection.equals("discount")){
           result = result * 5.00;
           System.out.printf("%.2f leva",result);
       }
       }
    }
