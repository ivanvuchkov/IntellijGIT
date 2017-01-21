import java.util.Scanner;

public class p06_LicePerimeter {
    public static void main(String[]args){

        Scanner console = new Scanner(System.in);
        double r=Double.parseDouble(console.nextLine());
        double area=Math.PI * r * r;
        double perimeter=2 * Math.PI * r;

        System.out.printf("area = %s ,perimeter = %s",area,perimeter);
    }
}
