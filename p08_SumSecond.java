import java.util.Scanner;

/**
 * Created by User on 07.10.2016.
 */
public class p08_SumSecond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());
        int result=num1+num2+num3;

        if (result<=59){
            System.out.println("0:"+result);
        }
        if (result>59){


        }
    }
}
