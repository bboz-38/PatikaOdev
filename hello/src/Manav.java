
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplam;
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        System.out.print("Armudun kilosunu giriniz: ");
        armutKilo = inp.nextDouble();
        System.out.print("Elmanın kilosunu giriniz: ");
        elmaKilo = inp.nextDouble();
        System.out.print("Domatesin kilosunu giriniz: ");
        domatesKilo = inp.nextDouble();
        System.out.print("Muzun kilosunu giriniz: ");
        muzKilo = inp.nextDouble();
        System.out.print("Patlıcanın kilosunu giriniz: ");
        patlicanKilo = inp.nextDouble();
        
        toplam = (armutKilo * 2.14) + (elmaKilo * 3.67) + (domatesKilo * 1.11) + (muzKilo * 0.95) + (patlicanKilo * 5.00);
        double sonuc = Math.round(toplam * 100.0) / 100.0;
        System.out.println("Borcunuz: " + sonuc + " tl");


        

        
        

        
    }
}
