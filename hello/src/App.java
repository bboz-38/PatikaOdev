
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        int mat,fizik,kimya,turkce,tarih,muzik;
        @SuppressWarnings("resource")
        Scanner inp = new  Scanner(System.in);

        System.out.print("Matematik notunuz giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int ortalama = toplam / 6;

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }

    
}
