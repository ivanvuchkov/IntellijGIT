import java.util.Scanner;

public class p09_CtoF {
    public static void main(String []args){
        Scanner console=new Scanner(System.in);
        double c=Double.parseDouble(console.nextLine());
        double f=c*1.8+32;

       System.out.printf("Fahrenheit is %.2f",f);

    }
}