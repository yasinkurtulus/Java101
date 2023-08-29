package Udemy.KonuBasliklari;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dizilerArraysSınıfı {
    public static void main(String[] args) {
        int[] sayilar={1,78,54,34,-69,-20,31};
        int[] sayilar2={1,78,54,34,-69,-20,31};
        int[] sayilar3={ };
        int[] sayilar4={ };
        diziyazdır(sayilar);
        //Arrays.sort bütün diziyi sıralar
        //Arrays.sort(sayilar);
        System.out.println("\n sıralandıktan sonra diziler");
       // diziyazdır(sayilar);
        //belli aralıktaki indexleri sıralar
        //Arrays.sort(sayilar,1,7);
        //parallelsort da sıralama yapar ama daha etkilidir
        Arrays.parallelSort(sayilar);
        diziyazdır(sayilar);
        //binarysearch dizinin içinde o eleman var mı yok mu ona bakar.
        //bu metotdan önce dizi sıralaması yapılmalıdır!
       int sonuc= Arrays.binarySearch(sayilar,50);
        System.out.println(sonuc);
        //Arrays.equels boolen değer  döndürür.İki dizinin eleman ve sıralrı aynıysa ture döndürür.
        System.out.println("sayilar ve sayilar2 dizisi eşit mi: "+ Arrays.equals(sayilar3,sayilar4));

        int[]yenidizi=new int[8];
        //Arrays.fill boş bir dizinin içini istenilen sayı ile doldurur
        Arrays.fill(yenidizi,2,6,31);
        diziyazdır(yenidizi);




    }
    public static  void diziyazdır(int[]dizi){
        for(int i:dizi){
            System.out.print(i+" ");
        }
    }

}


