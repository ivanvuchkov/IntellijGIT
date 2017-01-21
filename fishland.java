import java.util.Scanner;

public class fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double PreisSkumriqKg = Double.parseDouble(console.nextLine());
        double PreisCacaKg = Double.parseDouble(console.nextLine());
        double KgPalamut = Double.parseDouble(console.nextLine());
        double KgSafrit = Double.parseDouble(console.nextLine());
        int KgMidi = Integer.parseInt(console.nextLine());


        double preisPalamut = PreisSkumriqKg+PreisSkumriqKg*0.60;
        double sumPalamut = preisPalamut*KgPalamut;
        double preisSafrit = PreisCacaKg+PreisCacaKg*0.80;
        double sumSafrit = preisSafrit*KgSafrit;
        double sumMidi = KgMidi*7.50;

        double smetka = sumPalamut+sumSafrit+sumMidi;

        System.out.printf("%.2f",smetka);


    }
}
