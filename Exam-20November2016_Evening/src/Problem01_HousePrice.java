import java.util.Scanner;

public class Problem01_HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double smallestRoomArea = Double.parseDouble(scanner.nextLine());
        double kitchenArea = Double.parseDouble(scanner.nextLine());
        double priceSquareM = Double.parseDouble(scanner.nextLine());

        double secondRoom = smallestRoomArea + (smallestRoomArea * 0.10);
        double thirdRoom = secondRoom + (secondRoom * 0.10);
        double bathroom = smallestRoomArea / 2;
        double totalArea = smallestRoomArea +
                kitchenArea +
                secondRoom +
                thirdRoom +
                bathroom;
        double totalAreaCoridor = totalArea + (totalArea * 0.05);
        double price = totalAreaCoridor * priceSquareM;

        System.out.printf("%.2f",price);
    }
}
