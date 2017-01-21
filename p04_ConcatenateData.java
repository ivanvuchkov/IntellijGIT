/**
 * Created by User on 27.09.2016.
 */
import java.util.Scanner;
public class p04_ConcatenateData {
    public static void main(String[]args){
        Scanner console=new Scanner(System.in);
        String firstName=console.nextLine();
        String lastName=console.nextLine();
        int age=Integer.parseInt(console.nextLine());
        String town=console.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.",firstName,lastName,age,town);

     }
}
