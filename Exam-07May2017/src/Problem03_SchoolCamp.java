import java.util.Scanner;

public class Problem03_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine().toLowerCase();
        String groupType = scanner.nextLine().toLowerCase();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());


        String sportType = "";
        if (groupType.equals("girls") && season.equals("winter")){
            sportType = "Gymnastics";
        } else if (groupType.equals("girls") && season.equals("spring")){
            sportType = "Athletics";
        } else if (groupType.equals("girls") && season.equals("summer")){
            sportType = "Volleyball";
        } else if (groupType.equals("boys") && season.equals("winter")){
            sportType = "Judo";
        } else if (groupType.equals("boys") && season.equals("spring")){
            sportType = "Tennis";
        } else if (groupType.equals("boys") && season.equals("summer")) {
            sportType = "Football";
        } else if (groupType.equals("mixed") && season.equals("winter")){
            sportType = "Ski";
        } else if (groupType.equals("mixed") && season.equals("spring")){
            sportType = "Cycling";
        } else if (groupType.equals("mixed") && season.equals("summer")){
            sportType = "Swimming";
        }

        double price = 0;
        if (season.equals("winter") && groupType.equals("girls") ||
                season.equals("winter") && groupType.equals("boys")  ){
            price = students * 9.60 * nights;
        } else if (season.equals("spring") && groupType.equals("girls") ||
                season.equals("spring") && groupType.equals("boys") ){
            price = students * 7.20 * nights;
        } else if (season.equals("summer") && groupType.equals("girls") ||
                season.equals("summer") && groupType.equals("boys") ){
            price = students * 15 * nights;
        } else if (season.equals("winter") && groupType.equals("mixed")){
            price = students * 10 * nights;
        } else if (season.equals("spring") && groupType.equals("mixed")){
            price = students * 9.50 * nights;
        } else if (season.equals("summer") && groupType.equals("mixed")){
            price = students * 20 * nights;
        }

        if (students >= 50){
            price = price - (price * 0.5);
        } else if (students >= 20 && students < 50){
            price = price - (price * 0.15);
        } else if (students >= 10 && students < 20){
            price = price - (price * 0.05);
        }

        System.out.printf("%s %.2f lv.%n",sportType,price);
    }
}
