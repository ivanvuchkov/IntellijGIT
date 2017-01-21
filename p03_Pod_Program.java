import java.util.Scanner;

public class p03_Pod_Program {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int workDays = Integer.parseInt(console.nextLine());
        double moneyPerDay = Double.parseDouble(console.nextLine());;
        double change = Double.parseDouble(console.nextLine());

        double monthSelary = workDays*moneyPerDay;
        double bonus =monthSelary*2.5;
        double yearsSakary = monthSelary*12+bonus;
        yearsSakary=yearsSakary-yearsSakary*0.25;



        System.out.println(yearsSakary);
        double SalarytoLv=yearsSakary*change;
        double SalaryOfDay =SalarytoLv/365;

        System.out.println(SalaryOfDay);




}

}
