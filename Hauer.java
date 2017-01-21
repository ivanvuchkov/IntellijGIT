import java.util.Scanner;

/**
 * Created by User on 19.11.2016 г..
 */
public class Hauer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int HauerTest= Integer.parseInt(console.nextLine());
        int MinetsTest= Integer.parseInt(console.nextLine());
        int HauerPerson = Integer.parseInt(console.nextLine());
        int MinetsPerson = Integer.parseInt(console.nextLine());

        HauerTest+=MinetsTest;
        HauerPerson+=MinetsPerson;

        if (HauerTest>HauerPerson){
            int hauer=HauerTest-HauerPerson;
            if (hauer<10){
                System.out.printf("0:",hauer);
            }else if (hauer>10){
                System.out.println(hauer);
                int m = hauer%10;
                System.out.println("tova e M "+m);
            }

        }else if (HauerPerson>HauerTest){
            int hauer1=HauerPerson-HauerTest;
            System.out.println(hauer1);
        }

    }
}
