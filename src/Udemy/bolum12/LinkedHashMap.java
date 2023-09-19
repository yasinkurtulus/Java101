package Udemy.bolum12;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        //LinkedHashMap eklediğin sıraya göre verileri sıralar
        java.util.LinkedHashMap<String,Integer> isimler=new java.util.LinkedHashMap<>();
        isimler.put("yaso",1);
        isimler.put("bilal",5);
        isimler.put("ahmet",87);
        isimler.put("irem",57);
        for (Map.Entry<String,Integer> gecici:isimler.entrySet() )
            System.out.println(gecici);
        for (int gecici:isimler.values())
            System.out.println(gecici);
        System.out.println(isimler);
    }
}
