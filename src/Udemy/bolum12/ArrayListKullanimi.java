package Udemy.bolum12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListKullanimi {
    public void main(String[] args) {
        //Arraylistler primitive tür tutamaz
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(1, 8);
        System.out.println(sayilar);
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("yaso");
        isimler.add("taso");
        isimler.add("maso");
        System.out.println(isimler.size());
        ArrayList<String> isimler2 = new ArrayList<>(isimler);//isimler2 adlı arrayliste isimler adlı arraylisti atar
        System.out.println(isimler2);
        isimler2.clear();
        System.out.println(isimler2.isEmpty());
        System.out.println(isimler.contains("maso"));
        System.out.println(isimler.contains(0));
        //array listi diziye dönüştürmek için
        String[] yeniDizi = isimler.toArray(new String[0]);
        System.out.println(yeniDizi[1]);
        //Bir array listin belli bir elemanlarını yeni bir listeye atamak için
        List<String> yeniarray = isimler.subList(0, 2);
        System.out.println(yeniarray);
        //bir arrayliste başka array list ekleme
        ArrayList<String> isimler3 = new ArrayList<>();
        isimler3.add("irem");
        isimler3.add("bilal");
        isimler3.add("mutafa");
        isimler.addAll(isimler3);
        System.out.println(isimler);
        isimler.addAll(1, isimler3);
        System.out.println(isimler);
        Collections.sort(isimler);

        //diziyi array liste dönüştürmek
        String[] sehirler = {"sakarya", "eskişehir", "bursa"};
        List<String> sehitrlerlist;
        sehitrlerlist = Arrays.asList(sehirler);
        ArrayList<String> sehirler2 = new ArrayList<>(Arrays.asList(sehirler));
    }
}


