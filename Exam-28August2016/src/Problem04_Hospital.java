import java.util.Scanner;

public class Problem04_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int day = 1; day <= period; day++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if ((day % 3 == 0) && (untreatedPatients > treatedPatients)){
                doctors++;
            }
            if (patients > doctors){
                treatedPatients = treatedPatients + doctors;
                untreatedPatients = untreatedPatients + (patients - doctors);
            } else {
                treatedPatients = treatedPatients + patients;
            }
        }
        System.out.printf("Treated patients: %d.%n",treatedPatients);
        System.out.printf("Untreated patients: %d.%n",untreatedPatients);
    }
}
