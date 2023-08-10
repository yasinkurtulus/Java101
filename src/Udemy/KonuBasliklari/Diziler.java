package Udemy.KonuBasliklari;

import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {
        //10 elemanlı bir dize eleman olarak dize indeksinşn karesini atan bşr uygulama yazınız.
      /*  double dizi[]=new double[10];
        for(int i=0;i<dizi.length;i++){
            dizi[i]= Math.pow(i,2);
            System.out.println(dizi[i]);
        }*/
       Scanner scanner=new Scanner(System.in);
      /*  String aylar[]={"Ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"};
        System.out.println("Bulunduğunuz ayı girin: ");
        int ay=scanner.nextInt();
        System.out.println("Bulunduğunuz ay: "+aylar[ay-1]);*/
        System.out.println("Kaç sayının ortlamasını alacağınız: ");
        int a= scanner.nextInt();
        int sayidizisi[]=new int[a];
        for ( int i=0;i<sayidizisi.length;i++){
            System.out.println((i+1)+". sayıyı giriniz: ");
            sayidizisi[i]=scanner.nextInt();
        }
        double toplam=0;
        for (int i=0;i<sayidizisi.length;i++){
            toplam+=sayidizisi[i];

        }
        System.out.println("ortalama: "+toplam/a);


    }
}
