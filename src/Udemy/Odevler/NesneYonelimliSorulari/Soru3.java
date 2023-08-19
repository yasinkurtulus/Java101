package Udemy.Odevler.NesneYonelimliSorulari;

import java.util.Scanner;

public class Soru3 {
    /*Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için
    metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
    Bölme işlemi için 0 değerini için gerekli kontrolü yazın*/
    public static void main(String[] args) {
        boolean dongu=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        double sayi1=scanner.nextDouble();
        HesapMakinesi hesapMakinesi=new HesapMakinesi(sayi1);
        while (dongu){
            double sayi;
            System.out.println("İşlem seçiniz:");
            System.out.println("1-Carpma");
            System.out.println("2-Bolme");
            System.out.println("3-Toplama");
            System.out.println("4-Cıkarma");
            System.out.println("0-Sonuc");
            int islem=scanner.nextInt();
            switch (islem){
                case 0:
                    System.out.println(hesapMakinesi.getSonuc());
                    dongu=false;
                    break;
                case 1: System.out.println("Sayı giriniz:");
                    sayi=scanner.nextDouble();
                    hesapMakinesi.setSayi1(sayi);
                    hesapMakinesi.carp();
                    break;
                case 2:     System.out.println("Sayı giriniz:");
                    sayi=scanner.nextDouble();
                    if (sayi!=0){
                    hesapMakinesi.setSayi1(sayi);
                    hesapMakinesi.bol();}
                    else {
                        System.out.println("0 a bölünmez");
                        dongu=false;
                    }
                    break;

                case 3: System.out.println("Sayı giriniz:");
                    sayi=scanner.nextDouble();
                    hesapMakinesi.setSayi1(sayi);
                    hesapMakinesi.topla();
                    break;
                case 4:    System.out.println("Sayı giriniz:");
                sayi=scanner.nextDouble();
                hesapMakinesi.setSayi1(sayi);
                hesapMakinesi.cikar();
                break;

            }
        }

    }

}
class HesapMakinesi{
private double sayi;
private double sonuc;

public HesapMakinesi(double sayi1){
    this.sonuc =sayi1;
}
public double carp(){
    sonuc*= sayi;
    return sonuc;
}
public double bol(){
    sonuc/= sayi;
    return sonuc;
}
public double topla(){
    sonuc+=sayi;
    return sonuc;
}
public double cikar(){
    sonuc-=sayi;
    return sayi;
}

    public double getSayi1() {
        return sayi;
    }

    public void setSayi1(double sayi1) {
        this.sayi = sayi1;
    }

    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }
}
