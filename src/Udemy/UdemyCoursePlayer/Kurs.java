package Udemy.UdemyCoursePlayer;

import java.util.ArrayList;

public class Kurs {
    private String kursadi;
    private int derssayisi=0;
    private int kursSuresi=0;
    private boolean yayinlanabilir;
    private ArrayList<Egitmen> egitmenler;
    private ArrayList<Ogrenci> ogrenciler;
    private ArrayList<Ders> dersler;

    public Kurs(String Kursadi,Egitmen basEgitmen) {
        this.egitmenler=new ArrayList<>();
        this.ogrenciler=new ArrayList<>();
        this.dersler=new ArrayList<>();
        egitmenler.add(basEgitmen);
        this.kursadi = Kursadi;
        yayinlanabilir=false;

    }
    public void egitmenekle(Egitmen egitmen){
        if (egitmenler.contains(egitmen)){
            System.out.println("bu eğitmen zaten ekli");
        }
        else
        egitmenler.add(egitmen);
    }
    public void egitmenCikar(Egitmen egitmen){
        if (egitmen!=egitmenler.get(0)) {
            egitmenler.remove(egitmen);
            System.out.println(egitmen.getIsim()+" isimli eğitmen kurs eğitmenliğinden çıkarıldı");
        }
        else System.out.println("ana eğitmen çıkarılmaz");
    }
    public void ogrenciekle(Ogrenci ogrenci){
    if (yayinlanabilirkontrol()) {
        ogrenciler.add(ogrenci);
        System.out.println(ogrenci.getIsim()+" isimli öğrenci "+ kursadi+" isimli kursa katıldı");
    }
    else System.out.println("Bu kursa şuan öğrenci eklenemez");
    }
    public void ogrencicikar(Ogrenci ogrenci){
        ogrenciler.remove(ogrenci);
    }
    public void dersEkle(Ders ders){
        if (dersler.contains(ders)){
            System.out.println("bu ders zaten ekli");
        }
        else {
            dersler.add(ders);
            derssayisi++;
        }
    }
    public boolean yayinlanabilirkontrol(){
        if (toplamsure()>60&&derssayisi>=5)
            return true;
        else return false;
    }
   private int toplamsure(){
        for (Ders i: dersler)
            kursSuresi+=i.getDersSuresi();
        return kursSuresi;
   }

    public String getKursadi() {
        return kursadi;
    }
    public int getDerssayisi() {
        return derssayisi;
    }

    public void setDerssayisi(int derssayisi) {
        this.derssayisi = derssayisi;
    }
    public ArrayList<Egitmen> getEgitmenler() {
        return egitmenler;
    }

    public ArrayList<Ders> getDersler() {
        return dersler;
    }

    @Override
    public String toString() {
        return "Kurs:" +
                "kursadi='" + kursadi + '\'' +
                ' ';
    }
}
