package Udemy.bolum12;

import java.util.HashMap;

public class MapInterfacesiVeHashMap {
    public static void main(String[] args) {
        // map interfacesini 3 farlı sınıf gerçekleştirebilir
        // Haspmap /LinkedHaspmap/TreeMap
        //Haspmap karışık olarak verileri dizer
       /* HashMap<Integer,String> plakalar=new HashMap<>();
        plakalar.put(01,"adana");
        plakalar.put(34,"istanbul");
        plakalar.put(16,"bursa");
        plakalar.put(06,"ankara");
        plakalar.put(null,"nulldeger");
        plakalar.put(26,"eskisehir");
        plakalar.put(54,"sakarya");
        System.out.println(plakalar);
        System.out.println(plakalar.get(54));
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(26));
        HashMap<Integer,String> plakayedek=new HashMap<>();
        plakayedek.putAll(plakalar);
        System.out.println(plakayedek.size());
        plakayedek.clear();
        System.out.println(plakayedek.size());*/

        HashMap<String,Integer> map=new HashMap<>();
        map.put("yaso",10);
        map.put("bilo",5);
        map.put(null,2);
        map.put("irem",8);
    }
}
