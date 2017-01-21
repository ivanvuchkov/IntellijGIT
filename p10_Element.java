import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class p10_Element {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        //int max = Math.max

        int[] num_arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            num_arr[i] = num;
            sum += num;
        }

        for (int i = 0; i < n; i++) {
            if (num_arr[i] == sum - num_arr[i]) {
                System.out.println("Yes\n" +
                        "Sum = " + num_arr[i]);
                return;
            }
        }
        System.out.println(sum);


    }
}
