import java.util.Scanner;

public class p07_NumberToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        if (num==0){
            System.out.println("Zero");
        }
        if (num==1){
            System.out.println("One");
        }
        if (num==2){
            System.out.println("Two");
        }
        if (num==3){
            System.out.println("Three");
        }
        if (num==4){
            System.out.println("Four");
        }
        if (num==5){
            System.out.println("Five");
        }
        if (num==6){
            System.out.println("Six");
        }
        if (num==7){
            System.out.println("Seven");
        }
        if (num==8){
            System.out.println("Eight");
        }
        if (num==9){
            System.out.println("Nine");
        }
        if (num>=10){
            System.out.println("number too big");
        }

    }

}
