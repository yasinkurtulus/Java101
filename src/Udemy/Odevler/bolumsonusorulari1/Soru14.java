package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        /*Girilen bir metnin palindrome olup olmadığını kontrol eden programı yazınız.
        Tersten okunuşu aynı olan kelimeler palindrome'dur. Kaçak gibi*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime=scanner.next();
        int altsinir=0;
        Boolean polidrom=false;
        int ustsinir=kelime.length()-1;
        while (altsinir<=ustsinir){
            if (kelime.charAt(altsinir)!=kelime.charAt(ustsinir)){
                polidrom=false;
                System.out.println("Girilen kelime: "+kelime+" Polidrom kelime değildir");
                break;}
            else {
                altsinir++;
                ustsinir--;
                if (altsinir>=ustsinir){
                    polidrom=true;
                break;}
            }
        }
        if (polidrom==true)
            System.out.println("Girilen kelime: "+kelime+" Polidrom kelimedir");

    }


}
