import java.util.Scanner;

public class p16_Time {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hour = Integer.parseInt(console.nextLine());
        int min = Integer.parseInt(console.nextLine());
        min=min+15;

        if (min>=60){
            hour++;
            min=min-60;

        }
         if (hour>23){
            hour-=24;
        }if (min>10){
            System.out.println(hour+":"+"0"+min);
        }else
            System.out.println(hour+":"+min);


    }
}
