import java.util.Scanner;

public class p05_SumSecond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sec1= Integer.parseInt(console.nextLine());
        int sec2= Integer.parseInt(console.nextLine());
        int sec3= Integer.parseInt(console.nextLine());
        int secs= sec1+sec2+sec3;
        int min= 0;

        if (secs>59){
            min++;
            secs=secs-60;
        } if (secs>59){
            min++;
            secs=secs-60;
        } if (secs>59){
            min++;
            secs=secs-60;
        }
        if (secs<10){
            System.out.println(min+":"+"0"+secs);
        }else
            System.out.println(min+":"+secs);
    }
}
