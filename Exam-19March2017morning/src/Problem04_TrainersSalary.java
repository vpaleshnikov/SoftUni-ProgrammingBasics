import java.util.Scanner;

public class Problem04_TrainersSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lessons = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double lessonsJelev = 0;
        double lessonsRoYaL = 0;
        double lessonsRoli = 0;
        double lessonsTrofon = 0;
        double lessonsSino = 0;
        double lessonsOther = 0;

        double salaryJelev = 0;
        double salaryRoYaL = 0;
        double salaryRoli = 0;
        double salaryTrofon = 0;
        double salarySino = 0;
        double salaryOther = 0;

        for (int i = 0; i < lessons; i++) {
            String name = scanner.nextLine().toLowerCase();

            if (name.equals("jelev")){
                lessonsJelev++;
                salaryJelev = (salary / lessons)*lessonsJelev;
            }
            else if (name.equals("royal")){
                lessonsRoYaL++;
                salaryRoYaL = (salary / lessons)*lessonsRoYaL;
            }
            else if (name.equals("roli")){
                lessonsRoli++;
                salaryRoli = (salary / lessons)*lessonsRoli;
            }
            else if (name.equals("trofon")){
                lessonsTrofon++;
                salaryTrofon = (salary / lessons)*lessonsTrofon;
            }
            else if (name.equals("sino")){
                lessonsSino++;
                salarySino = (salary / lessons)*lessonsSino;
            }
            else {
                lessonsOther++;
                salaryOther = (salary / lessons)*lessonsOther;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%n",salaryJelev);
        System.out.printf("RoYaL salary: %.2f lv%n",salaryRoYaL);
        System.out.printf("Roli salary: %.2f lv%n",salaryRoli);
        System.out.printf("Trofon salary: %.2f lv%n",salaryTrofon);
        System.out.printf("Sino salary: %.2f lv%n",salarySino);
        System.out.printf("Others salary: %.2f lv%n",salaryOther);

    }
}
