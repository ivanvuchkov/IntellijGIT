import java.util.Scanner;

public class p03_Hotel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String month = console.nextLine();
        int nights = Integer.parseInt(console.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;
        double apartmentDiscount = 1;
        double studioDiscount = 1;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (nights > 14) {
                    studioDiscount -= 0.30;
                }
                else if (nights > 7) {
                    studioDiscount -= 0.05;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    studioDiscount = 0.20;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }
        if (nights > 14) {
            apartmentDiscount = apartmentDiscount - 0.10;
        }
        double studioTotalPrice = studioPrice * nights * studioDiscount;
        double apartmmentTotalPrice = apartmentPrice * nights * apartmentDiscount;

        System.out.printf("Apartment: %.2f lv.%n", apartmmentTotalPrice);
        System.out.printf("Studio: %.2f lv %n", studioTotalPrice);

    }
}
