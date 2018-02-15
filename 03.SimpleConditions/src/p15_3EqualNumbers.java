import java.util.Scanner;

public class p15_3EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a == b){
            if (b == c){
                if (a == c){
                    System.out.println("yes");
                }
            }
        }
        if (a != b){
            if (b == c){
                if (a == c){
                    System.out.println("no");
                }
            }
        }
        if (a == b){
            if (b != c){
                if (a == c){
                    System.out.println("no");
                }
            }
        }
        if (a == b){
            if (b == c){
                if (a != c){
                    System.out.println("no");
                }
            }
        }
        if (a != b){
            if (b != c){
                if (a != c){
                    System.out.println("no");
                }
            }
        }
        if (a == b){
            if (b != c){
                if (a != c){
                    System.out.println("no");
                }
            }
        }
        if (a != b){
            if (b == c){
                if (a != c){
                    System.out.println("no");
                }
            }
        }
        if (a != b){
            if (b != c){
                if (a == c){
                    System.out.println("no");
                }
            }
        }
    }
}
