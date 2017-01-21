import java.util.Scanner;

public class p01_Valu {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter amount : ");
        double amnt= Double.parseDouble(console.nextLine());
        System.out.printf("Enter input currency : ");
        String in=console.nextLine();
        System.out.printf("Enter output currency : ");
        String out=console.nextLine();

        double rateUsd=1.79549;
        double rateEur=1.95583;
        double rateGbp=2.53405;

        double amntOut = 0;

        switch(in){
            case "USD":
                amntOut=amnt*rateUsd;
                break;
            case "EUR":
                amntOut=amnt*rateEur;
                break;
            case "GBP":
                amntOut=amnt*rateGbp;
                break;
            case "BGN":
                amntOut=amnt;
                break;
        }

        switch(out){
            case "USD":
                amntOut=amntOut/rateUsd;
                break;
            case "EUR":
                amntOut=amntOut/rateEur;
                break;
            case "GBP":
                amntOut=amntOut/rateGbp;
                break;
            case "BGN":
                amntOut=amntOut;
                break;
        }

        System.out.printf("Result : %.2f %s ",amntOut,out );



    }
}
