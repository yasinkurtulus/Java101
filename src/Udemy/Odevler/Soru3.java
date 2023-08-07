package Udemy.Odevler;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Soru 3 : Klavyeden girilen finak ve vize notlarına göre öğrencinin geçip geçmediğiniz hesaplayınız
        System.out.println("Vize Notunuzu Giriniz: ");
        double vizenotu=scanner.nextDouble();
        System.out.println("Vize Notunuzu Giriniz: ");
        double finalnotu=scanner.nextDouble();
        double sonuc=(finalnotu*60/100)+(vizenotu*40/100);
        if (sonuc<50&&sonuc>=0)
            System.out.println("Notunuz: "+sonuc+" kaldınız");
        else if (sonuc<100&&sonuc>=50) {
            System.out.println("Notunuz: "+sonuc+" Geçtiniz");
        }
        else
            System.out.println("Geçerli Bir not giriniz!");
    }
}
