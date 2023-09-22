package Udemy.UdemyCoursePlayer;

public class Main {
    public static void main(String[] args) {
            Ogrenci ogr1=new Ogrenci("Yasin","ogrenci");
            Egitmen e1=new Egitmen("emre","Bas egitmen");
            Egitmen e2=new Egitmen("ceren","yardımcı");
            Ders d1=new Ders("Java Giris",10,1);
            Ders d2=new Ders("Primitive Tipler",12.4,2);
            Ders d3=new Ders("Diziler",20.3,3);
            Ders d4=new Ders("Metodlar",7.5,4);
            Ders d5=new Ders("İf else",16.9,5);
            Kurs javakursu=new Kurs("Temel Java Kursu",e1);
            javakursu.dersEkle(d1);
            javakursu.dersEkle(d2);
            javakursu.dersEkle(d3);
            javakursu.dersEkle(d4);
            javakursu.dersEkle(d4);
            javakursu.egitmenekle(e2);
            javakursu.egitmenekle(e2);
            ogr1.kursaKatil(javakursu);
            javakursu.dersEkle(d5);
            ogr1.kursaKatil(javakursu);
            javakursu.egitmencikar(e1);
            javakursu.egitmencikar(e2);
    }
}
