import java.util.Scanner;

public class p11_AreaOfFigurs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str=console.nextLine();

        if (str.equals("square")){
            double num= Double.parseDouble(console.nextLine());
            num=num*num;
            System.out.println(num);
        }else if (str.equals("rectangle")){
            double num1= Double.parseDouble(console.nextLine());
            double num2= Double.parseDouble(console.nextLine());
            double res=num1*num2;
            System.out.println(res);
        }else if (str.equals("circle")){
            double num3= Double.parseDouble(console.nextLine());
            double res1=(num3*num3)*Math.PI;
            System.out.printf("%.3f",res1);
        }else if (str.equals("triangle")){
            double num4= Double.parseDouble(console.nextLine());
            double num5= Double.parseDouble(console.nextLine());
            double res2=num4*num5/2;
            System.out.println(res2);
        }
    }
}
