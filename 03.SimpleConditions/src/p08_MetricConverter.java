import java.util.Scanner;

public class p08_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine();
        String out = scanner.nextLine();

        if (in.equals("mm")){
            a = a / 1000.0;
        } else if (in.equals("cm")){
            a = a / 100.0;
        } else if (in.equals("mi")){
            a = a / 0.000621371192;
        } else if (in.equals("in")){
            a = a / 39.3700787;
        } else if (in.equals("km")){
            a = a / 0.001;
        } else if (in.equals("ft")){
            a = a / 3.2808399;
        } else if (in.equals("yd")){
            a = a / 1.0936133;
        }
        if (out.equals("mm")){
            a = a * 1000.0;
        } else if (out.equals("cm")){
            a = a * 100.0;
        } else if (out.equals("mi")){
            a = a * 0.000621371192;
        } else if (out.equals("in")){
            a = a * 39.3700787;
        } else if (out.equals("km")){
            a = a * 0.001;
        } else if (out.equals("ft")){
            a = a * 3.2808399;
        } else if (out.equals("yd")){
            a = a * 1.0936133;
        }
        System.out.printf("%f %s",a,out);
    }
}
