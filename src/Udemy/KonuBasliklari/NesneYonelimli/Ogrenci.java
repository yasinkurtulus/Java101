package Udemy.KonuBasliklari.NesneYonelimli;

public class Ogrenci {
    String isim;
    int numara;
    int sinif;
    boolean aktiflik;
    public Ogrenci(){
        isim="isim girilmedi";
        numara=0000;
        sinif=0000;
        aktiflik=true;
    }
    public Ogrenci(String isim,int numara,int sube){
        this.isim=isim;
        this.sinif=sube;
        this.numara=numara;
        this.aktiflik=aktiflik;
    }
    public Ogrenci(String isim,int no,int sinif,boolean aktiflik){
        this(isim,no,sinif);
        this.aktiflik=aktiflik;

    }
    public void ogrencibilgileriyazdır(){
        if (aktiflik)
        System.out.println("öğrenci:"+isim+" numara:"+numara+" sınıf:"+sinif);
        else {
            System.out.println("Öğrenci aktif değil.");
        }
    }

}
