import java.util.Scanner;

public class p07_BigShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String day = console.nextLine().toLowerCase();
        double qauntity = Double.parseDouble(console.nextLine());
        double price = -1;

        boolean isWorkDay = day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday");
        boolean isWeekend = day.equals("sunday") || day.equals("saturday");

        if (isWorkDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
            }
            if (fruit.equals("apple")) {
                price = 1.20;
            }
            if (fruit.equals("orange")) {
                price = 0.85;
            }
            if (fruit.equals("grapefruit")) {
                price = 1.45;
            }
            if (fruit.equals("pineapple")) {
                price = 5.50;
            }
            if (fruit.equals("grapes")) {
                price = 3.85;
            }
            if (fruit.equals("kiwi")) {
                price = 2.70;
            }
        } else if (isWeekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
            }
            if (fruit.equals("apple")) {
                price = 1.25;
            }
            if (fruit.equals("orange")) {
                price = 0.90;
            }
            if (fruit.equals("grapefruit")) {
                price = 1.60;
            }
            if (fruit.equals("pineapple")) {
                price = 5.60;
            }
            if (fruit.equals("grapes")) {
                price = 4.20;
            }
            if (fruit.equals("kiwi")) {
                price = 3.00;
            }
        }

        if (price != -1) {
            System.out.println(price * qauntity);
        }else {
            System.out.println("error");
        }

    }

}
