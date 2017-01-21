import java.util.Scanner;

public class p04_EventOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter two integers: ");

        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());

        if (first >= second){
            System.out.println("Greater number: "+first);
        }
        else {
            System.out.println("Greater number: "+second);
        }
    }
}
