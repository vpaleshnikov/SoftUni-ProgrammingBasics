import java.util.Scanner;

public class problem04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int gradeCount = 0;
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;
        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradeCount++;
            if (grade >= 2.00 && grade <= 2.99) {
                grade1++;
                grade5 += grade;
            }
            if (grade >= 3.00 && grade <= 3.99){
                grade2++;
                grade5 += grade;
            }
            if (grade >= 4.00 && grade <= 4.99){
                grade3++;
                grade5 += grade;
            }
            if (grade >= 5.00){
                grade4++;
                grade5 += grade;
            }
        }
        grade5 = grade5 / students;
        grade4 = (grade4 / students) * 100;
        grade3 = (grade3 / students) * 100;
        grade2 = (grade2 / students) * 100;
        grade1 = (grade1 / students) * 100;
        System.out.printf("Top students: %.2f%%%n",grade4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",grade3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",grade2);
        System.out.printf("Fail: %.2f%%%n",grade1);
        System.out.printf("Average: %.2f%n",grade5);
    }
}
