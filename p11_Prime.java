import java.util.Scanner;

public class p11_Prime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        boolean isPrime = true;
        if (n > 2) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 1 == 0) {
                    isPrime = false;
                    break;
                }


            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }
}
