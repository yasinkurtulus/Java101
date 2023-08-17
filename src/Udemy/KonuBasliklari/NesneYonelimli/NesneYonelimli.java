package Udemy.KonuBasliklari.NesneYonelimli;

public class NesneYonelimli {
    public static void main(String[] args) {
        Ogrenci[] tumogrenciler=new Ogrenci[100];
        Ogrenci yasin=new Ogrenci();
        yasin.isim="yasin";
        yasin.sinif=12;
        yasin.numara=194;
        yasin.aktiflik=true;
        yasin.ogrencibilgileriyazdır();
        Ogrenci bilal=new Ogrenci("bilal",12,131,true);
        bilal.ogrencibilgileriyazdır();
        Ogrenci ogr1=new Ogrenci("İrem",190,12,true);
        tumogrenciler[0]=ogr1;
        
        ogr1.sinif=9;
        tumogrenciler[0].ogrencibilgileriyazdır();


    }
}
