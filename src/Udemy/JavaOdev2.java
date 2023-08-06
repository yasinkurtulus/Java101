package Udemy;

import java.util.Scanner;

public class JavaOdev2 {
    public static void main(String[] args) {
        //Odev 1 : Kullanıcıdan aldığınız verilerle vücüt kitle endeksini hesaplayınız.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (cm cinsinden): ");
        double boy=scanner.nextDouble();
        System.out.println("kilonuzu giriniz: ");
        double kilo=scanner.nextDouble();
        double vki=kilo/(Math.pow(boy/100,2));
        if (vki<15)
        System.out.println("vücut kitle endeksiniz: "+vki+" Çok ciddi derecede düşük kilolusunuz");
        else if (15<vki&&vki<=16) {
            System.out.println("vücut kitle endeksiniz: "+vki+" ciddi derecede düşük kilolusunuz");
        }
        else if (16<vki&&vki<=18){
            System.out.println("vücut kitle endeksiniz: "+vki+"  düşük kilolusunuz");
        }
        else if (18<vki&&vki<=25){
            System.out.println("vücut kitle endeksiniz: "+vki+"  normal kilolusunuz");
        }
        else if (25<vki&&vki<=30){
            System.out.println("vücut kitle endeksiniz: "+vki+"  fazla kilolusunuz");
        }
        else if (30<vki){
            System.out.println("vücut kitle endeksiniz: "+vki+"  1.Derece Obez ");
        }

        //Odev 2 : Piyango Oyunu
            int randomsayi=(int)(Math.random()*101);
        while(randomsayi<10&&randomsayi>=100){
             randomsayi=(int)(Math.random()*101);
        }

        int sansliSayibirincibasamak=randomsayi/10;
        int sansliSayiikincibasamak=randomsayi%10;


        while (true){
            System.out.println(randomsayi);
            System.out.println("İki basamaklı sayıyı tahmin ediniz: ");
            int tahmin=scanner.nextInt();
            int tahminSayibirincibasamak=tahmin/10;
            int tahminSayiikincibasamak=tahmin%10;

            if (tahmin==randomsayi){
                System.out.println("Tebrikler 10.000TL kazandınız  Şanslı Sayı: "+randomsayi+"Tahmininiz: "+tahmin);
                 break;}
            else if (tahminSayiikincibasamak==sansliSayibirincibasamak&&tahminSayibirincibasamak==sansliSayiikincibasamak) {
                System.out.println("Tebrikler 5.000TL kazandınız  Şanslı Sayı: "+randomsayi+"Tahmininiz: "+tahmin);
                break;
            } else if ((tahminSayibirincibasamak==sansliSayibirincibasamak&&tahmin!=randomsayi)||(tahminSayiikincibasamak==sansliSayiikincibasamak&&tahminSayibirincibasamak!=sansliSayibirincibasamak))
            {
                System.out.println("Tebrikler 1000TL kazandınız  Şanslı Sayı: "+randomsayi+"Tahmininiz: "+tahmin);
                break;
            }
            else{
                System.out.println("Bilemediniz Tekrar deneyin");
            }
        }


    }
}
