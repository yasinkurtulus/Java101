package Udemy.bolum12;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortedSetveSortedMapMetodlari {
    public static void main(String[] args) {
       TreeMap<String,Integer> map=new TreeMap<>();
       TreeSet<String> set=new TreeSet<>();
        map.put("5",5);
        map.put("emre",5);
        map.put("2",8);
        map.put("9",9);
        set.add("3");
        set.add("1");
        set.add("2");
        set.add("hasan");
        set.add("zeynep");
        //set.add("hasan");
        //set.add("ahmet");
        System.out.println(map);
        System.out.println(map.comparator());
        System.out.println(set.comparator());
        System.out.println(map.subMap("2","emre"));
        System.out.println(set.subSet("7","ahmet"));
        System.out.println(set.headSet("zeynep"));
        System.out.println(map.headMap("4"));
        System.out.println(set.tailSet("3"));
        System.out.println(map.tailMap("1"));
        System.out.println(map.firstEntry());
        System.out.println(map.firstKey());
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("lower "+map.lowerKey("9"));//lower girilen değerin bir küçüğünü dönderir
        System.out.println("lower "+map.lowerKey("z"));
        System.out.println("higher"+map.higherKey("2"));
        System.out.println(set.floor("4"));//floor varsa girilen değeri yoksa onun bir küçüğünü dönderir
        System.out.println(set.floor("2"));
        System.out.println(map.ceilingEntry("3"));// ceiling floorun tam tersi
        System.out.println(map.pollFirstEntry());//ilk elemanı çıkarır tersi lasttır
        System.out.println(map);
        Iterator<String> iterator= set.descendingIterator();//tersten okur
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
