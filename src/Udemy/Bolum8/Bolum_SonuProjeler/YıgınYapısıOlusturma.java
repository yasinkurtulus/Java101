package Udemy.Bolum8.Bolum_SonuProjeler;

import Udemy.KonuBasliklari.NesneYonelimli.Ogrenci;

import java.util.ArrayList;

public class YıgınYapısıOlusturma {
    public static void main(String[] args) {
        Insan yasin=new Insan(19,"yaso");
        Insan bilal =new Insan(20,"bilo");
        Bılgısayar pc1=new Bılgısayar(10000,"asus");
        Yıgın yıgın1=new Yıgın();
        System.out.println(yıgın1.bosmu());
        yıgın1.push(yasin);
        yıgın1.push(bilal);
        yıgın1.bosmu();
        yıgın1.pop();
        yıgın1.kacelemanvar();
        Bılgısayar pc2=new Bılgısayar(78500,"Leonova");
        yıgın1.push(pc2);
    }
}
class Yıgın{
    ArrayList<Object>objeler=new ArrayList<>();


public boolean bosmu(){
        if (objeler.size()>0)
            return false;
        else
            return true;
}
    public void kacelemanvar(){
        System.out.println(objeler.size());
    }
    public void pop (){
    if(objeler.size()>0){
        System.out.println("çıkarılan eleman "+objeler.get(objeler.size()-1) );
        objeler.remove(objeler.size()-1);}
    }
    public void push (Object obje){
        System.out.println("eklenilen eleman "+obje);
        objeler.add(objeler.size(),obje);
    }
    public void elemanAl(){
        System.out.println("en üstteki eleman :"+objeler.get(objeler.size()-1));
    }
}
class Insan{
   private int yas;
    String isim;

    public Insan(int yas, String isim) {
        this.yas = yas;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "yas=" + yas +
                ", isim='" + isim + '\'' +
                '}';
    }
}
class Bılgısayar{
    int fiyat;
    String marka;

    public Bılgısayar(int fiyat, String marka) {
        this.fiyat = fiyat;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Bılgısayar{" +
                "fiyat=" + fiyat +
                ", marka='" + marka + '\'' +
                '}';
    }
}

