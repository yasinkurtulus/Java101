package Udemy.Odevler.VizeSorulari;

import java.util.Scanner;

public class VizeSoru2 {
    public static void main(String[] args) {
        /*//SORU 2: Decimal sayıları binary formatına çeviren java programını yazınız.
        Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Binary sayıya çevirmek istediğiniz sayıyı giriniz: ");
        String binarysayi="";
        int sayi=scanner.nextInt();
        if (sayi==0)
            System.out.println("0 ın ikilik tbaanda karşılığı:  "+0);

        int mod;

        while (sayi>0){
            mod=sayi%2;
            sayi=sayi/2;
            binarysayi=mod+binarysayi;
        }
        System.out.println(" sayisinin binary karşılığı: "+binarysayi);

    }
}
