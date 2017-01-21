import java.util.Scanner;

public class p07_RightOrLeft {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(console.nextLine());
            leftSum+=num;
            
        }
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(console.nextLine());
            rightSum +=num;

        }
        if (rightSum == leftSum){
            System.out.println("Yes, sum = "+ leftSum);
        }else {
            System.out.println("No, diff= "+Math.abs(leftSum-rightSum));
        }


    }
}
