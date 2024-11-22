
import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        double kmUcreti = 2.20;
        int minimumTutar = 20;
        int acilisUcreti = 10;
        double odenecekTutar = (km * kmUcreti) + acilisUcreti;

        if (odenecekTutar < 20) {
            odenecekTutar = minimumTutar;
            System.out.println("Borcunuz: " + minimumTutar);
        } else {
            System.out.println("Borcunuz: " + odenecekTutar);
        }
    }
}