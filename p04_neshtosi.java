import java.util.Scanner;

/**
 * Created by User on 15.11.2016 г..
 */
public class p04_neshtosi {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());

        int sum =Math.abs(n-m);
        System.out.println(sum);

    }
}
