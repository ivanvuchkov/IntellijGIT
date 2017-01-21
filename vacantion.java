import java.util.Scanner;

public class vacantion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int Old = Integer.parseInt(console.nextLine());
        int Child = Integer.parseInt(console.nextLine());
        int nights = Integer.parseInt(console.nextLine());
        String transport = console.nextLine();

        double oldPrice = 0;
        double childPreis =0;

        int people = Child+Old;

        switch (transport){
            case "train" :
                oldPrice=24.99;
                childPreis=14.99;
                if(people>=50){
                    oldPrice=oldPrice-(oldPrice*0.50);
                    childPreis=childPreis-(childPreis*0.50);
                }
                break;
            case "bus" :
                oldPrice = 32.50;
                childPreis = 28.50;
                break;
            case "boat" :
                oldPrice = 42.99;
                childPreis = 39.99;
                break;
            case "airplane" :
                oldPrice = 70.00;
                childPreis = 50.00;

        }

        double sumTransport = ((Old*oldPrice)+(Child*childPreis))*2;
        double grupNights  = nights*82.99;
        double comissions  = (sumTransport+grupNights)*0.10;
        double sum = sumTransport+grupNights+comissions;


        System.out.printf("%.2f",sum);

    }
}
