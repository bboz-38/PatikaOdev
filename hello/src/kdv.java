

import java.util.Scanner;

public class kdv {

   public static void main(String[] args) {
    double tutar,sonuc;
    Scanner inp = new Scanner(System.in);
    System.out.print("Ücret tutarını giriniz: ");
    tutar = inp.nextDouble();
    double kdvOrani1 = tutar * 0.18;
    double kdvOrani2 = tutar * 0.08;
    double kdvLiTutar1 = tutar + kdvOrani1;
    double kdvLiTutar2 = tutar + kdvOrani2;

    if(tutar > 0 && tutar < 1000){
         sonuc = kdvLiTutar1;
    }
    else{
        sonuc = kdvLiTutar2;
    }
    System.out.println("Toplam tutar: " + sonuc);
    
   }
    
}
