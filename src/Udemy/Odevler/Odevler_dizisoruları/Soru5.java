package Udemy.Odevler.Odevler_dizisoruları;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
        soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
        tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
        Değerler A,B,C,D,E olmalı.
        Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
        rastgele oluşturulmalı.
        Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
        ve yanlışı olduğunu gösteren programı yazınız.*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("öğrenci sayısı giriniz: ");
        int ogrencisayi = scanner.nextInt();
        System.out.println("soru sayısı girin: ");
        int sorusayisi = scanner.nextInt();
        char[][]ogrencicevaplari=new char[ogrencisayi][sorusayisi];
        char[] dogrucevaplar = new char[sorusayisi];
        cevapanahtariolustur(dogrucevaplar);
        ogrencicevaplarıolustur(ogrencicevaplari);
        kontrolet(dogrucevaplar,ogrencicevaplari);
    }

    public static char cevapolustur(){
        int rastgelesayi=65+(int)(Math.random()*5);
        char cevap=(char) rastgelesayi;
        return cevap;
    }

    public static void cevapanahtariolustur(char dizi[]) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = cevapolustur();
            System.out.println(dizi[i]);
        }
    }

    public static void ogrencicevaplarıolustur(char[][]dizi){
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                dizi[i][j]=cevapolustur();
            }
        }
    }
    public static void kontrolet(char[]cevapanahtari,char[][]ogrencicevaplari){

        for (int i=0;i<ogrencicevaplari.length;i++){
            int dogrucevapsayisi=0;
            for (int j=0;j<ogrencicevaplari[i].length;j++){
                if (cevapanahtari[j]==ogrencicevaplari[i][j]){
                    dogrucevapsayisi++;
                }
            }
            System.out.println(i+" nolu öğrencinin doğru cevap sayisi: "+dogrucevapsayisi);
        }

    }
}
