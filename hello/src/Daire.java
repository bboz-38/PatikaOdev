
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int yaricap,aciOlcusu;
        double alan,piSayisi=3.14;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap ölçüsünü giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        aciOlcusu = input.nextInt();
        alan = (piSayisi * (yaricap * yaricap) * aciOlcusu) / 360;
        System.out.println("Dairenin alanı: " + alan);
    }
}

