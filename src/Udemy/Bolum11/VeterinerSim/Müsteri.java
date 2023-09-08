package Udemy.Bolum11.VeterinerSim;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Müsteri extends Kisi{
    private String adres;
    ArrayList<Hayvan> sahipolunanhayvanlar;



    public Müsteri(String isim, int id,String adres) {
        super(isim, id);
        this.adres=adres;
        sahipolunanhayvanlar=new ArrayList<>();
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void hayvanekle(Hayvan hayvan){
        sahipolunanhayvanlar.add(hayvan);
    }
    public void sahipolunanhayvanlistele(){
        System.out.println("Sahip Olunan Hayvanlar");
        for (Hayvan i:sahipolunanhayvanlar){
            System.out.println(i.getIsim());
        }
    }

    @Override
    public void bilgilerigoster() {
        System.out.println("İsim:"+getIsim()+" Adres"+adres);
        sahipolunanhayvanlistele();
    }
}
