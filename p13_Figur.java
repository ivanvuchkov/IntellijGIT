import java.util.Scanner;

public class p13_Figur {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());
        boolean in = false;
        boolean border = false;
        if ((x > 0 && x < h * 3) && (y > 0 && y < h)) {
            in = true;
        }

        if ((x > h && x < h * 2) && (y > h && y < h * 4)) {
            in = true;
        }

        if ((x > h && x < h * 2) && (y == h)) {
            in = true;
        }
        if ((x >= 0 && x <= h * 3) && (y == 0)) {
            border = true;
        }
        if ((x >= h && x <= h * 2) && (y == h * 4)) {
            border = true;
        }
        if ((x >= 0 && x <= h) && (y == h)) {
            border = true;
        }
        if ((x >= h * 2 && x <= h * 3) && (y == h)) {
            border = true;
        }
        if ((x == h) && (y >= h && y <= h * 4)) {
            border = true;
        }
        if ((x == h * 2) && (y >= h && y <= h * 4)) {
            border = true;
        }
        if ((x == 0) && (y >= 0 && y <= h)) {
            border = true;
        }
        if ((x == h*3) && (y >= 0 && y <= h)) {
            border = true;
        }


        if (border) {
            System.out.println("border");
        } else if (in) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
