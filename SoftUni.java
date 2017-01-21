import java.util.Scanner;

public class SoftUni {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int group = Integer.parseInt(console.nextLine());

        double car = 0;
        double microbus = 0;
        double smallBus = 0;
        double bigBus = 0;
        double train = 0;
        double allPeople = 0;

        for (int i = 0; i < group; i++) {
            int personOfgroup = Integer.parseInt(console.nextLine());

            if (personOfgroup <= 5) {
                car += personOfgroup;
            } else if (personOfgroup >= 6 && personOfgroup <= 12) {
                microbus += personOfgroup;
            } else if (personOfgroup >= 13 && personOfgroup <= 25) {
                smallBus += personOfgroup;
            } else if (personOfgroup >= 26 && personOfgroup <= 40) {
                bigBus += personOfgroup;
            } else if (personOfgroup >= 41) {
                train += personOfgroup;
            }

            allPeople = car + microbus + smallBus + bigBus + train;


        }

        double carP = car * 100 / allPeople;
        double microbusP = microbus * 100 / allPeople;
        double smallBusP = smallBus * 100 / allPeople;
        double bigBusP = bigBus * 100 / allPeople;
        double trainP = train * 100 / allPeople;


        System.out.printf("%.2f%%%n", carP);
        System.out.printf("%.2f%%%n", microbusP);
        System.out.printf("%.2f%%%n", smallBusP);
        System.out.printf("%.2f%%%n", bigBusP);
        System.out.printf("%.2f%%%n", trainP);

    }
}