import java.util.Scanner;

public class p09_MetricConvetor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input= Double.parseDouble(console.nextLine());
        String FromUnit=console.nextLine();
        String ToUnit=console.nextLine();


        double met=0;
        double con=0;

        if (FromUnit.equals("mm")){
            met=input/1000;
        }else if (FromUnit.equals("cm")){
            met=input/100;
        }else if (FromUnit.equals("m")){
            met=input;
        } else if (FromUnit.equals("mi")){
            met=input/0.000621371192;
        }else if (FromUnit.equals("in")){
            met=input/39.3700787;
        }else if (FromUnit.equals("km")){
            met=input/0.001;
        }else if (FromUnit.equals("ft")){
            met=input/3.2808399;
        }else if (FromUnit.equals("yd")){
            met=input/1.0936133;
        }
        if (ToUnit.equals("mm")){
            con=met*1000;
        }else if (ToUnit.equals("cm")){
            con=met*100;
        }else if (ToUnit.equals("m")){
            con=met;
        }else if (ToUnit.equals("mi")){
            con=met*0.000621371192;
        }else if (ToUnit.equals("in")){
            con=met*39.3700787;
        }else if (ToUnit.equals("km")){
            con=met*0.001;
        }else if (ToUnit.equals("ft")){
            con=met*3.2808399;
        }else if (ToUnit.equals("yd")){
            con=met*1.0936133;
        }
        System.out.printf("%f %s",con,ToUnit);

    }
}
