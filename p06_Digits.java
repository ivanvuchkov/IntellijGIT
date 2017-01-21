import java.util.Scanner;

public class p06_Digits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        int firstDigits = number / 100;
        int secondDigits = (number / 10) % 10;
        int thirdDigits = number % 10;

        int rows = firstDigits + secondDigits;
        int cols = firstDigits + thirdDigits;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (number % 5 == 0) {
                    number -= firstDigits;
                } else if (number % 3 == 0) {
                    number -= secondDigits;
                } else {
                    number += thirdDigits;
                }
                System.out.print(" " + number);
            }
            System.out.println();
        }
    }
}
