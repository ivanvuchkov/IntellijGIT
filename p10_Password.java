import java.util.Scanner;

public class p10_Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String pas=console.nextLine();

        if (pas.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else
            System.out.println("Wrong password!");
    }
}
