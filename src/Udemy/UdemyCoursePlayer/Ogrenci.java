package Udemy.UdemyCoursePlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi{

 private  ArrayList<Kurs> katılınılankurslar;
 private LinkedList<Ders> izlenecekDersListesi;
    public Ogrenci(String isim, String rol) {
        super(isim, rol);
        katılınılankurslar=new ArrayList<>();
        izlenecekDersListesi=new LinkedList<>();
    }

    public LinkedList<Ders> getIzlenecekDersListesi() {
        return izlenecekDersListesi;
    }

    public void kursaKatil(Kurs kurs){
        kurs.ogrenciekle(this);
        if (!(katılınılankurslar.contains(kurs))&&kurs.yayinlanabilirkontrol())
        katılınılankurslar.add(kurs);
        else System.out.println("bu kursa zaten katıldı");
    }

    public ArrayList<Kurs> getKatılınılankurslar() {
        return katılınılankurslar;
    }
    public void setIzlenecekDersListesiDersEkle(Ders ders){
        boolean dersbulundu=false;
        if (katılınılankurslar.size()>0){
            for (Kurs i:katılınılankurslar){
                if (i.getDersler().contains(ders)&&!(izlenecekDersListesi.contains(ders))){
                    izlenecekDersListesi.add(ders);
                    System.out.println(i.getKursadi()+" kursundaki "+ ders.getDersAdi()+" isimli ders listeye eklendi!");
                    dersbulundu=true;
                    break;
                }
            }
            if ((dersbulundu==false)){
                System.out.println("Eklenecek dersin kursuna henüz katılmadınız Veya Zaten Ekli");
            }
        }
        else System.out.println("Henüz hiç bir kursa katılmadınız");
    }
}
