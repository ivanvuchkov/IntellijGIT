import java.util.Scanner;

public class p01_Program {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int workDays = Integer.parseInt(console.nextLine());
        double moneyPerDay = Double.parseDouble(console.nextLine());
        double change = Double.parseDouble(console.nextLine());

        double monthSalary = workDays*moneyPerDay;
        double bonus = monthSalary *2.5;
        double yearSalary = monthSalary * 12 +bonus;

        yearSalary -= yearSalary*0.25;

        double salaryInlev = yearSalary*change;
        double dailyPay  = salaryInlev /365;

        System.out.printf("%.2f",dailyPay);
        //String moth = console.nextLine();

    }
}
