package Udemy.Odevler.NesneYonelimliSorulari;

import java.util.Scanner;

public class Soru1 {/*CemberDaire isimli sınıf oluşturun. Bu sınıfın yarıçap alan kurucusu
            olmalı.Ayrıca cevre ve alanını hesaplayan metotlar olmalı. */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yarı çap giriniz:");
        double yaricap=scanner.nextDouble();
        CemberDaire c1=new CemberDaire(yaricap);
        c1.AlanHesapla();
        c1.Cevre();

    }
}
class CemberDaire{
   private double yaricap;
    public CemberDaire(Double r){
        this.yaricap=r;
    }
    public void AlanHesapla(){
        double alan=Math.PI*(Math.pow(yaricap,2));
        System.out.printf("Dairenin alanı: %.2f",alan);
    }
    public void Cevre(){
        double cevre=2*Math.PI*yaricap;
        System.out.printf("Dairenin çevresi: %.2f",cevre);
    }


}
