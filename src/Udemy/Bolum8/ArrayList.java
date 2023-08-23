package Udemy.Bolum8;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
       //Telefon[]telefons=new Telefon[20];
        Telefon tel1=new Telefon(2000,"xiaomi");
        Telefon tel2=new Telefon(2500,"samsung");
        Telefon tel3=new Telefon(5000,"iphone");
        Telefon tel4=new Telefon(1000,"Mate10");
      /*  telefons[0]=tel1;
        telefons[1]=tel2;
        telefons[2]=tel3;
        System.out.println(telefons[0]);
        telefons=new Telefon[25];
        System.out.println(telefons[0]);*/
        //dizilerle sadece belirli bir alan açabilirz ileride alanı arttırmak istediğimizde önceki veriler de kaybolur
        //bunun için array listler kullanırız.
        java.util.ArrayList<Telefon>telefons=new java.util.ArrayList<>();
        telefons.add(tel1);
        telefons.add(tel2);
        telefons.add(2,tel3);
        telefons.add(1,tel4);
        System.out.println(telefons.size());
        telefons.remove(1);
        System.out.println(telefons.get(1));
        Listeyiyazdır(telefons);
    }
    public static void Listeyiyazdır(java.util.ArrayList<Telefon> list){
        for (Telefon teleofns :list){
            System.out.println(teleofns);
        }
    }
}
class Telefon{
    int fiyat;
    String marka;

    public Telefon(int fiyat, String marka) {
        this.fiyat = fiyat;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "fiyat=" + fiyat +
                ", marka='" + marka + '\'' +
                '}';
    }
}
