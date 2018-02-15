import java.util.Scanner;

public class Problem04_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loadAmmount = Integer.parseInt(scanner.nextLine());
        int allLoads = 0;
        double upToThreeSum = 0;
        double upToElevenSum = 0;
        double overTwelveSum = 0;
        for (int i = 0; i < loadAmmount; i++) {
            int loadTones = Integer.parseInt(scanner.nextLine());
            if (loadTones <= 3){
                allLoads += loadTones;
                upToThreeSum += loadTones;
            }
            if (loadTones > 3 && loadTones <= 11){
                allLoads += loadTones;
                upToElevenSum += loadTones;
            }
            if (loadTones > 11){
                allLoads += loadTones;
                overTwelveSum += loadTones;
            }
        }
        double bus = (upToThreeSum / allLoads) * 100;
        double truck = (upToElevenSum / allLoads) * 100;
        double train = (overTwelveSum / allLoads) * 100;
        double pricePerTon = ((upToThreeSum * 200) + (upToElevenSum * 175) + (overTwelveSum * 120)) / allLoads;

        System.out.printf("%.2f%n",pricePerTon);
        System.out.printf("%.2f%%%n",bus);
        System.out.printf("%.2f%%%n",truck);
        System.out.printf("%.2f%%%n",train);
    }
}
