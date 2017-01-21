import java.util.Scanner;

public class pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int kgFood = Integer.parseInt(console.nextLine());
        double kgFoodDog = Double.parseDouble(console.nextLine());
        double kgFoodCat = Double.parseDouble(console.nextLine());
        double GrFoodKostenurka = Double.parseDouble(console.nextLine());

        double neededFoodDog = days*kgFoodDog;
        double neededFoodCat = days*kgFoodCat;
        double neededFoodKo = days*GrFoodKostenurka/1000;

        double sumFood = neededFoodDog+neededFoodCat+neededFoodKo;

        if (kgFood>=sumFood){
            double more = (int)kgFood-sumFood;
            System.out.printf("%.0f kilos of food left.",Math.floor(more));

        }
        else {
            double small =Math.abs(kgFood-sumFood);
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(small));
        }
    }
}
