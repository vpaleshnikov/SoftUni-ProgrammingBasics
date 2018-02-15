import java.util.Scanner;

public class p10_AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine().toLowerCase();

        switch (type){
            case "dog":
                System.out.println("mammal");break;
            case "crocodile":
                System.out.println("reptile");break;
            case "tortoise":
                System.out.println("reptile");break;
            case "snake":
                System.out.println("reptile");break;
            default:
                System.out.println("unknown");break;
        }
    }
}
