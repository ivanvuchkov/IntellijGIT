import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftRight = (n - 1) / 2;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            System.out.print(repeatStr("-", leftRight) + "*");
            int midDasheshes = (n - 2) - (leftRight * 2);
            if (midDasheshes >= 0) {
                System.out.print(repeatStr("-", midDasheshes) + "*");
            }

            System.out.println(repeatStr("-", leftRight));
            leftRight--;
        }
        leftRight = 1;
        for (int i = 0; i < (n - 1) / 2; i++) {
            System.out.print(repeatStr("-", leftRight) + "*");
            int midDasheshes = (n - 2) - (leftRight * 2);
            if (midDasheshes >= 0) {
                System.out.print(repeatStr("-", midDasheshes) + "*");
            }

            System.out.println(repeatStr("-", leftRight));
            leftRight++;
        }
    }

    static String repeatStr(String str, int count) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeated.append(str);

        }
        return repeated.toString();
    }
}
