package Udemy.Odevler.Odevler_dizisoruları;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        /*100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
        rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
        elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
        tane eleman olduğunu yazdırın.
        */
        int toplam=0;
       int[]dizi=new int[100];
       for (int i=0;i< dizi.length;i++){
           int randomsayi=(int)(Math.random()*101);
           dizi[i]=randomsayi;
           toplam+=dizi[i];
       }
       double ortalama=toplam/ dizi.length;
        Arrays.parallelSort(dizi);
      //  diziyazdır(dizi);
       // System.out.println("\n ortalama: " +ortalama);
        int ortalamaltindakisayı=0;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]<ortalama)
                ortalamaltindakisayı++;
        }
        System.out.println("sayıların ortlaması: "+ortalama+" ortalma altındaki ayı: "+ortalamaltindakisayı);

    }
    public static void diziyazdır(int[]dizi){
        for(int i:dizi)
            System.out.print(i+", ");
    }
}
