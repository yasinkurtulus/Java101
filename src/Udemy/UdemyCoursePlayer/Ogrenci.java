package Udemy.UdemyCoursePlayer;

import java.util.ArrayList;

public class Ogrenci extends Kisi{

 private  ArrayList<Kurs> katılınılankurslar;
    public Ogrenci(String isim, String rol) {
        super(isim, rol);
        katılınılankurslar=new ArrayList<>();
    }
    public void kursaKatil(Kurs kurs){
        kurs.ogrenciekle(this);
        if (!(katılınılankurslar.contains(kurs)))
        katılınılankurslar.add(kurs);
        else System.out.println("bu kursa zaten katıldı");
    }

    public ArrayList<Kurs> getKatılınılankurslar() {
        return katılınılankurslar;
    }
}
