package Udemy.UdemyCoursePlayer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static Udemy.KonuBasliklari.Methodlar.menu;

public class Main {
       static Scanner scanner=new Scanner(System.in);
       static  ArrayList<Kurs> kurslar=new ArrayList<>();
       static  ArrayList<Ders> dersler=new ArrayList<>();
       static  Egitmen e1;
        public static void main(String[] args) {
               /* Ogrenci ogr1 = new Ogrenci("Yasin", "ogrenci");
                Egitmen e1 = new Egitmen("emre", "Bas egitmen");
                Egitmen e2 = new Egitmen("ceren", "yardımcı");
                Ders d1 = new Ders("Java Giris", 10, 1);
                Ders d2 = new Ders("Primitive Tipler", 12.4, 2);
                Ders d3 = new Ders("Diziler", 20.3, 3);
                Ders d4 = new Ders("Metodlar", 7.5, 4);
                Ders d5 = new Ders("İf else", 16.9, 5);
                Ders d6 = new Ders("Nesneler", 17.9, 6);
                Ders d7 = new Ders("Kotlin Ders1", 20.8, 7);
                Kurs javakursu = new Kurs("Temel Java Kursu", e1);
                Kurs kotlinKurs = new Kurs("Kotlin Kursu", e2);
                kotlinKurs.dersEkle(d2);
                kotlinKurs.dersEkle(d3);
                kotlinKurs.dersEkle(d7);
                javakursu.dersEkle(d1);
                javakursu.dersEkle(d2);
                javakursu.dersEkle(d3);
                javakursu.dersEkle(d4);
                javakursu.dersEkle(d4);
                javakursu.egitmenekle(e2);
                ogr1.kursaKatil(javakursu);
                javakursu.dersEkle(d5);
                ogr1.kursaKatil(javakursu);
                ogr1.kursaKatil(kotlinKurs);
                javakursu.egitmenCikar(e1);
                javakursu.egitmenCikar(e2);
                ogr1.setIzlenecekDersListesiDersEkle(d1);
                ogr1.setIzlenecekDersListesiDersEkle(d2);
                ogr1.setIzlenecekDersListesiDersEkle(d3);
                ogr1.setIzlenecekDersListesiDersEkle(d7);
                izlenemListesiGez(ogr1.getIzlenecekDersListesi());*/
                System.out.println("Adınızı Giriniz:");
                String egitmenad=scanner.nextLine();
                 e1=new Egitmen(egitmenad,"Bas Egitmen");
                boolean dongu=true;
                while (dongu){
                        System.out.println("Yapmak İstediğiniz işlem");
                        System.out.println("*********MAIN MENU*********");
                        System.out.println("1-Kurs İşlemleri");
                        System.out.println("2-Ogrenci Ekle");
                        System.out.println("0-Çıkış");
                        int secim= scanner.nextInt();
                        switch (secim){
                                case 0: dongu=false;
                                break;
                                case 1:kursIslemeri();
                        }

                }

        }

        private static void kursIslemeri() {
                boolean dongu=true;
                while(dongu){
                System.out.println("****Kurs Islemleri****");
                System.out.println("1-Yeni Kurs Olustur");
                System.out.println("2-Mevcut Kursa Ders Ekle");
                System.out.println("3-Kurs Kaldır");
                System.out.println("4-Kurslari Listele");
                System.out.println("0-Ust Menu");
                int secim= scanner.nextInt();
                switch (secim){
                        case 0:dongu=false;
                        break;
                        case 1: kursekle();
                        break;
                        case 2: dersekle();
                }
                }


        }

        private static void dersekle() {
                boolean dongu=true;
                while (dongu){
                        System.out.println("Hangi Kursa Ders Ekleyeceksiniz");
                        kurslistele();
                        int secim= scanner.nextInt();;
                        if(secim<=kurslar.size()&&secim>0) {
                                System.out.println("Ders Basligi Giriniz");
                                scanner.nextLine();
                                String baslik=scanner.nextLine();
                                System.out.println("Ders Suresi:");
                                double sure= scanner.nextDouble();
                                System.out.println("Ders Oluşturuldu");
                                kurslar.get(secim-1).dersEkle(new Ders(baslik,sure,0));
                        }
                }
        }

        private static void kurslistele() {
                int a=1;
                for (Kurs i:kurslar){
                        System.out.println(a+" "+i);
                        a++;
                }

        }

        private static void kursekle() {
                System.out.println("Kurs Adi Giriniz: ");
                 scanner.nextLine();
                String kursadi= scanner.nextLine();
                kurslar.add(new Kurs(kursadi,e1));
                System.out.println(kursadi+" Adli Kurs Oluşturulmuştur");
        }

        public static void izlenemListesiGez(LinkedList<Ders> liste) {
                Scanner scanner = new Scanner(System.in);
                ListIterator<Ders> listiterator = liste.listIterator();
                if (listiterator.nextIndex()==0)
                        listiterator.next();
                boolean ilerihareket=true;
                boolean dongu = true;
                if (liste.size() > 0) {
                        while (dongu) {
                                izlenmelistemenu();
                                System.out.println("İşlem Seçiniz");
                                int islem = scanner.nextInt();
                                switch (islem) {
                                        case 0:
                                                dongu = false;
                                                break;
                                        case 1:
                                                if (listiterator.hasNext())
                                                        listiterator.next();
                                                System.out.println(listiterator.previous());
                                        case 2:
                                                if (listiterator.hasNext())
                                                        System.out.println("Oynatılan video " + listiterator.next());
                                                else System.out.println("Listenin sonuna geldiniz");
                                                break;
                                        case 3:
                                                if (listiterator.hasPrevious()&&ilerihareket){
                                                        ilerihareket=false;
                                                        listiterator.previous();
                                                }
                                                if (listiterator.hasPrevious())
                                                        System.out.println("Oynatılan Video " + listiterator.previous());
                                                else System.out.println("Listenin sonuna geldiniz");
                                                break;
                                        case 4:listeGoruntule(liste);
                                }
                        }
                }
        }

    public static void izlenmelistemenu(){
            System.out.println("******MENU***********");
            System.out.println("0-ÇIKIŞ");
            System.out.println("1-Oynatılan Video Bilgi");
            System.out.println("2-Sıradaki Video");
            System.out.println("3-Önceki Video");
            System.out.println("4-Listeyi Görüntüle");
    }
    public static void  listeGoruntule(LinkedList<Ders> liste){
            ListIterator<Ders> listIterator=liste.listIterator();
            if (listIterator.hasNext()){
                    while (listIterator.hasNext()){
                            System.out.println(listIterator.next());}
            }
            else System.out.println("Liste Boş");
        }
}
