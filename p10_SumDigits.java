import java.util.Scanner;

public class p10_SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n= Integer.parseInt(console.nextLine());

        int sum =0;
        do {
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;

        }while (n>0);
        System.out.println(sum);
    }
}
