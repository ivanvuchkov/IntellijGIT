import java.util.Scanner;

public class p10_Radians {
    public static void main(String[]args){
        Scanner console=new Scanner(System.in);
        double rad=Double.parseDouble(console.nextLine());
        double deg=rad*180/Math.PI;

        System.out.printf("deg %.0f",deg);

    }
}
