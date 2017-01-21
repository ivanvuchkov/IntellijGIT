import java.util.Scanner;

public class p04_Hospital {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int day = 1; day <= days; day++) {
            int patients = Integer.parseInt(console.nextLine());
            if ((day % 3 == 0) && (untreatedPatients > treatedPatients)) {
                doctors++;
            }
            if (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            } else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);

    }
}
