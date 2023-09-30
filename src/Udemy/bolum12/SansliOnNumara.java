package Udemy.bolum12;

import java.util.*;
import java.util.TreeMap;

public class SansliOnNumara {
    private static final int OLUSTURLACAK_SAYI_ADETİ=100;
    private static final int MAX_DEGER=61;
    public static void main(String[] args) {
        HashMap<Integer,Integer>numaralar=new HashMap<>();
        List<Integer> liste=new ArrayList<>();
        Set<Integer>set=new TreeSet<>();
        for (int i=0;i<OLUSTURLACAK_SAYI_ADETİ;i++){
            int sayi=(int)(Math.random()*MAX_DEGER);
            if (numaralar.containsKey(sayi)){
                numaralar.put(sayi,numaralar.get(sayi)+1);
            }
            else {
                numaralar.put(sayi,1);
            }
        }
        mapiListeyeYazdir(numaralar,liste);
        Collections.shuffle(liste);
        System.out.println(liste.size());
        listeyiSeteEkle(set,liste);
        System.out.println(set);

    }

    private static void listeyiSeteEkle(Set<Integer> set, List<Integer> liste) {
        while (set.size()<10){
            int random=(int)(Math.random()*OLUSTURLACAK_SAYI_ADETİ);
            set.add(liste.get(random));
        }
    }

    private static void mapiListeyeYazdir(HashMap<Integer, Integer> numaralar, List<Integer> liste) {
        for (Map.Entry<Integer,Integer> i:numaralar.entrySet()){
                int adet=i.getValue();
                for (int a=0;a<adet;a++){
                   liste.add(i.getKey());
            }
        }

    }

}
