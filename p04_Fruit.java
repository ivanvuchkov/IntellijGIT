import java.util.Scanner;

public class p04_Fruit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        if (input.equals("banana") || input.equals("apple") || input.equals("cherry") || input.equals("lemon") || input.equals("grapes") ||
                input.equals("kiwi")) {
            System.out.println("fruit");
        } else if (input.equals("tomato") || input.equals("cucumber") || input.equals("pepper") || input.equals("carrot")){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
