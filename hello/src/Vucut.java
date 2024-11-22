
import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double boy, kilo;
        @SuppressWarnings("resource")
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: " + indeks);

    }
}
