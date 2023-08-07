package Udemy.Odevler;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Soru1 kalvyeden girilen 3 sayının ortalamasını alan bir program yazınız.
        Scanner scanner=new Scanner(System.in);
        System.out.println("3 tane sayı giriniz: ");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        double sayi3=scanner.nextDouble();
        double sonuc=(sayi1+sayi2+sayi3)/3;
        System.out.println(sonuc);
    }
}
