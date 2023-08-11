package Udemy.KonuBasliklari;

public class Metodlarvediziler {
    public static void main(String[] args) {
        String isimler[]={"taso","yaso","ahmet"};
        int sayilar[]={0,75,64,23};
      /*  System.out.println("metotdan önce index 0: "+sayilar[0]);
        diziyiarttır(sayilar[1]);
        System.out.println("metotdan sonra index 0: "+sayilar[0]);
        System.out.println("diziyiarttırmadan önce önce: ");
        diziyazdır(sayilar);
        System.out.println("diziyi arttırdıktan sonra: ");
        diziyiarttır(sayilar);
        diziyazdır(sayilar);
        toplambul(0,5,7,45,-20);
        toplambul(7,-5);*/
        diziyazdır(diziyitsinecevir(sayilar));


    }
    public static void diziyazdır(int dizi[]){
        for(int i:dizi){
            System.out.println(i);
        }
    }
    //bu kullanımda dizinin değerinin kopyası gönderilir ve gerçek değeri değişmez
    public static void diziyiarttır(int i){
        i++;
    }
    //bu kullanımda dizinin kendisi göderilir ve dizinin değerleri değişir
    public static void diziyiarttır(int sayilar[]){
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }
    //toplamını bulacağımız parametre sayısı belli değilse tek tek metot tanımlamak yerinde bu yöntem kullanılabilir
    public static void toplambul(int... parametreler){
        int toplam=0;
        for(int i:parametreler){
            toplam+=i;
        }
        System.out.println("toplam: "+toplam);
    }
    public static int[]diziyitsinecevir(int[]dizi){
        int []tersdizi=new int[dizi.length];
        for (int i=dizi.length-1,a=0;a<dizi.length;i--,a++){
            tersdizi[a]=dizi[i];
        }
        return tersdizi;
    }
}
