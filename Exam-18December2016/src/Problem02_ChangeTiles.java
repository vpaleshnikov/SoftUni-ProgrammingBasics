import java.util.Scanner;

public class Problem02_ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sybraniPari = Double.parseDouble(scanner.nextLine());
        double shirinaNaPoda = Double.parseDouble(scanner.nextLine());
        double dyljinaNaPoda = Double.parseDouble(scanner.nextLine());
        double stranataNaTriygylnika = Double.parseDouble(scanner.nextLine());
        double visochinataNaTriygylnika = Double.parseDouble(scanner.nextLine());
        double cenataNaEdnaPlochka = Double.parseDouble(scanner.nextLine());
        double sumataNaMaistora = Double.parseDouble(scanner.nextLine());
        double fira = 5;

        double ploshttaNaPoda = shirinaNaPoda * dyljinaNaPoda;
        double ploshttaNaPlochka = (stranataNaTriygylnika * visochinataNaTriygylnika) / 2;

        double neobhodimiPlochki = Math.ceil(ploshttaNaPoda / ploshttaNaPlochka) + fira;
        double obshtaSuma = (neobhodimiPlochki * cenataNaEdnaPlochka) + sumataNaMaistora;

        if (obshtaSuma < sybraniPari){
            double ostavashtiPari = sybraniPari - obshtaSuma;
            System.out.printf("%.2f lv left.%n",ostavashtiPari);
        } else {
            double nedostigashtiPari = obshtaSuma - sybraniPari;
            System.out.printf("You'll need %.2f lv more.%n",nedostigashtiPari);
        }
    }
}
