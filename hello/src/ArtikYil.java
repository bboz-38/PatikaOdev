
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yıl alma
        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        // Geçerli veri kontrolü
        if (yil <= 0) {
            System.out.println("Geçersiz bir yıl girdiniz!");
        } else {
            // Artık yıl kontrolü
            boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

            // Sonucu yazdırma
            if (artikYil) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }
        }
    }
}
