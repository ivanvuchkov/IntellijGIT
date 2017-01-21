import java.util.Scanner;

public class p12_Velleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String year= console.nextLine();;
        int p = Integer.parseInt(console.nextLine());
        int h = Integer.parseInt(console.nextLine());

        double result=0;
        double result1=0;
        double result2=0;
        double res=0;
        double res1=0;
        if (year.equals("normal")){
            result=48-h;
            result1=result*3.0/4;
            result2=p*2.0/3;
            res=result1+result2+h;
            System.out.println(Math.floor(res));

        }
        if (year.equals("leap")){
            result=48-h;
            result1=result*3.0/4;
            result2=p*2.0/3;
            res=result1+h+result2;
            res1=res+(res*0.15);
            System.out.println(Math.floor(res1));

        }

    }

}
