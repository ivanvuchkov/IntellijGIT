import java.util.Scanner;

public class p06_PintInRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());

        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        boolean isOnLeftSide=(x == x1) && (y>=y1 && y<=y2);
        boolean isOnReightSide = (x==x2) && (y>=y1 && y<=y2);
        boolean isOnTopSide = (y ==y1) && (x>=x1 && x<=x2);
        boolean isOnBottSide = (y == y2 )&& (x>=x1 && x<=x2);

        if (isOnLeftSide || isOnReightSide || isOnTopSide || isOnBottSide){
            System.out.println("Border");
        }else {
            System.out.println("Inside/Outside");
        }

    }
}
