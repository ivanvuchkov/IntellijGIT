import java.util.Scanner;


public class footbol {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double money =3000;// Double.parseDouble(console.nextLine());
        String ticket  ="Normal"; ///console.nextLine();
        int people = 11;Integer.parseInt(console.nextLine());
        double money1=1;
        double moneyForTicket=0;

        if (ticket.equals("Normal")){
            moneyForTicket=people*249.99;
        }else if (ticket.equals("VIP")){
            moneyForTicket=people*499.99;
        }

        if (people<=4){
            money1 =money*0.75;

        }else if (people>5||people<=9){
            money1=money*0.60;

        }else if (people>10||people<=24){
            money1=money*0.50;

        }else if (people>25||people<=49){
            money1 =money*0.40;

        }else if (people>=50){
            money1 =money*0.25;

        }


        System.out.println(money1);



       // double lastmoney = Math.abs(money-moneyForTicket);
        //double lasmoney = moneyForTicket-money;
        if (money1>moneyForTicket){
            double m = money1-moneyForTicket;
            System.out.printf("Yes! You have %.2f   leva left.",m);
        }else if (money1<moneyForTicket){
            double n = moneyForTicket-money1;
            System.out.printf("Not enough money! You need %.2f leva.",n);
        }





    }
}
