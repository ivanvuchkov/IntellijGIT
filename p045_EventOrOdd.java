import java.util.Scanner;

public class p045_EventOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num= Integer.parseInt(console.nextLine());
        if (num%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
