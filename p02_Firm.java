import java.util.Scanner;

public class p02_Firm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int neededHaur = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int overTimeWorkers = Integer.parseInt(console.nextLine());

        double workDays = days - (days * 0.1);
        double firmHaur = workDays * 8;
        double overTime = overTimeWorkers * 2 * days;

        double sumHaur = Math.floor(overTime + firmHaur);
        int lastHaur = (int) Math.abs(sumHaur - neededHaur);

        if (sumHaur >= neededHaur) {
            System.out.printf("Yes!%d hours left.", lastHaur);
        } else if (sumHaur < neededHaur) {
            System.out.printf("Not enough time!%d hours needed.", lastHaur);
        }


    }
}
