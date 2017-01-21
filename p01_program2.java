import java.util.Scanner;

public class p01_program2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int workDay = Integer.parseInt(console.nextLine());
        double moneyDay = Double.parseDouble(console.nextLine());
        double change = Double.parseDouble(console.nextLine());

        double monthSalary = workDay * moneyDay;
        double bonus = monthSalary*2.5;
        double yearSalary = monthSalary*12+bonus;

        yearSalary -= yearSalary*0.25;

        double leva = change*yearSalary;
        double salaryOfDay = leva /365;

        System.out.printf("%.2f",salaryOfDay);
    }
}
