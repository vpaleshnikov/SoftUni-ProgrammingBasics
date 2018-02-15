import java.util.Scanner;

public class Problem03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vyzrastni = Integer.parseInt(scanner.nextLine());
        int uchenici = Integer.parseInt(scanner.nextLine());
        int noshtuvki = Integer.parseInt(scanner.nextLine());
        String transport = scanner.nextLine().toLowerCase();

        double vlakV = 24.99;
        double busV = 32.50;
        double korabV = 42.99;
        double samoletV = 70.00;
        double vlakU = 14.99;
        double busU = 28.50;
        double korabU = 39.99;
        double samoletU = 50.00;
        double ednaNoshtuvka = 82.99;


        boolean nad50 = vyzrastni + uchenici >= 50;
        boolean pod50 = vyzrastni + uchenici < 50;

        if (transport.equals("train")){
            if (nad50){
                double vlak = (vyzrastni * (vlakV - (vlakV * 0.50)) + (uchenici * (vlakU - (vlakU * 0.50)))) * 2;
                double hotel = noshtuvki * ednaNoshtuvka;
                double komisionna = (vlak + hotel) * 0.10;
                double cqlaSuma = vlak + hotel + komisionna;
                System.out.printf("%.2f",cqlaSuma);
            } else if (pod50){
                double vlak = ((vyzrastni * vlakV) + (uchenici * vlakU)) * 2;
                double hotel = noshtuvki * ednaNoshtuvka;
                double komisionna = (vlak + hotel) * 0.10;
                double cqlaSuma = vlak + hotel + komisionna;
                System.out.printf("%.2f",cqlaSuma);
            }
        } else if (transport.equals("bus")){
            double bus = ((vyzrastni * busV) + (uchenici * busU)) * 2;
            double hotel = noshtuvki * ednaNoshtuvka;
            double komisionna = (bus + hotel) * 0.10;
            double cqlaSuma = bus + hotel + komisionna;
            System.out.printf("%.2f",cqlaSuma);
        } else if (transport.equals("boat")){
            double korab = ((vyzrastni * korabV) + (uchenici * korabU)) * 2;
            double hotel = noshtuvki * ednaNoshtuvka;
            double komisionna = (korab + hotel) * 0.10;
            double cqlaSuma = korab + hotel + komisionna;
            System.out.printf("%.2f",cqlaSuma);
        } else if (transport.equals("airplane")){
            double samolet = ((vyzrastni * samoletV) + (uchenici * samoletU)) * 2;
            double hotel = noshtuvki * ednaNoshtuvka;
            double komisionna = (samolet + hotel) * 0.10;
            double cqlaSuma = samolet + hotel + komisionna;
            System.out.printf("%.2f",cqlaSuma);
        }

    }
}