import java.util.Scanner;

public class p11_Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String tip= console.nextLine().toLowerCase();
        int r= Integer.parseInt(console.nextLine());
        int c= Integer.parseInt(console.nextLine());
        double res=r * c;

        switch (tip){
            case "premiere":
                res=res*12;
                System.out.printf("%.2f leva",res);
                break;
            case "normal":
                res=res*7.50;
                System.out.printf("%.2f leva",res);
                break;
            case"discount":
                res=res*5;
                System.out.printf("%.2f leva",res);

        }
    }
}
