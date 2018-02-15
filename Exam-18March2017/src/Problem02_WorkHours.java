import java.util.Scanner;

public class Problem02_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neobhodimiChasove = Integer.parseInt(scanner.nextLine());
        int broiRabotnici = Integer.parseInt(scanner.nextLine());
        int rabDni = Integer.parseInt(scanner.nextLine());

        int rabChasa = broiRabotnici * rabDni * 8;

        if (rabChasa > neobhodimiChasove){
            int left = rabChasa - neobhodimiChasove;
            System.out.printf("%d hours left",left);
        } else if (rabChasa < neobhodimiChasove){
            int overtime = neobhodimiChasove - rabChasa;
            int neustoiki = overtime * rabDni;
            System.out.printf("%d overtime%n",overtime);
            System.out.printf("Penalties: %d",neustoiki);
        }
    }
}
