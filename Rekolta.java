import java.util.Scanner;

public class Rekolta {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        int z = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        double rekolta = x*y;
        double toWine = rekolta*0.40;
        double wine =toWine/2.5;
        double neededwine =Math.abs(wine-z);

        if (wine<z){
            int min = (int) Math.floor(neededwine);
            //System.out.printf("It will be a tough winter! More %d liters wine needed.",neededwine);
            System.out.println("It will be a tough winter! More "+min+" liters wine needed.");
        }else if (wine>z){
            double plusWine =neededwine/workers;
           // int max =(int) Math.ceil(wine);
            //int max1 =(int) Math.ceil(plusWine);
            //System.out.printf("Good harvest this year! Total wine: %d %n liters.",wine);
            System.out.println("Good harvest this year! Total wine: "+(int) Math.ceil(wine)+" liters.");
            //System.out.printf("%d liters left -> %d liters per person.",neededwine,plusWine);
            System.out.println((int) neededwine+" liters left -> "+(int) Math.ceil(plusWine)+" liters per person.");
        }

    }
}