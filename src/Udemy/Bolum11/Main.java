package Udemy.Bolum11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[]isimler={"yaso","taso"};
        Integer[]sayilar={0,10,24};
        Character[]karakterler={'a','h','m'};

        GenericClass<String> stringyazdir=new GenericClass<>();
        stringyazdir.yazdir(isimler);
        GenericClass<Integer> ıntegreyazdir=new GenericClass<>();
        ıntegreyazdir.yazdir(sayilar);
        GenericClass<Character> charyazdir=new GenericClass<>();
        charyazdir.yazdir(karakterler);

        ArrayList<Integer> liste=new ArrayList();
        //liste.add("yaso");
        liste.add(1);
        //liste.add('s');
        for (Object i:liste){

        }
    }
}
