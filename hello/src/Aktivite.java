
import java.util.Scanner;

public class Aktivite {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        int heat = scn.nextInt();

        if(heat <5){
            System.out.println("Kayak yap");
        }
        if(heat >5 && heat <15){
            System.out.println("Sinemaya git");
        }
        if(heat >15 && heat <25){
            System.out.println("Pikniğe git");
        }
        if(heat >25){
            System.out.println("Yüzmeye git");
        }
    }
}
