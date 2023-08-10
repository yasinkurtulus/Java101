package Udemy.KonuBasliklari;

public class Foreach {
    public static void main(String[] args) {
        int sayilar[]={12,4,57,9};
        int dizi[]=new int[3];
        dizi[0]=1;
        dizi[2]=5;
        String isimler[]={"yasin","ahmet"};
      /*  for (int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }*/
        for(int i:dizi)
            System.out.println(i);
    }
}
