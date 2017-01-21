import java.util.Scanner;

public class p08_Comission {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town= console.nextLine().toLowerCase();
        double sales= Double.parseDouble(console.nextLine());
        double comissions=-1;

        if (town.equals("sofia")){
            if (0<sales && sales <500){
                comissions=sales*0.05;
            }else if (500<sales && sales<=1000){
                comissions=sales*0.07;
            }else if (1000<sales && sales<=10000){
                comissions=sales*0.08;
            }else if (sales>10000){
                comissions=sales*0.12;
            }

        }
        if (town.equals("varna")){
            if (0<sales && sales <=500){
                comissions=sales*0.045;
            }else if (500<sales && sales<=1000){
                comissions=sales*0.075;
            }else if (1000<sales && sales<=10000){
                comissions=sales*0.10;
            }else if (sales>10000){
                comissions=sales*0.13;
            }
        }
        if (town.equals("plovdiv")){
            if (0<sales && sales <=500){
                comissions=sales*0.055;
            }else if (500<sales && sales<=1000){
                comissions=sales*0.08;
            }else if (1000<sales && sales<10000){
                comissions=sales*0.12;
            }else if (sales>10000){
                comissions=sales*0.145;
            }

        }if (comissions!=-1)
            System.out.printf("%.2f",comissions);
        else {
            System.out.println("error");
        }

    }
}

