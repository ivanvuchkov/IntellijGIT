import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double bitkoin = Double.parseDouble(console.nextLine());
        double iona= Double.parseDouble(console.nextLine());
        double comision = Double.parseDouble(console.nextLine());

        comision =comision/100;
        double bitkoinToLev = bitkoin*1168;
        double ionaTodolars = iona*0.15;
        double dolarToLev = ionaTodolars*1.76;

        double leva = bitkoinToLev+dolarToLev;
        double levToeuro= leva/1.95;
        double comision1 = levToeuro*comision;
        double euro = levToeuro -comision1;

        System.out.println(euro);

        //System.out.printf("%.2f",euro);



    }
}
