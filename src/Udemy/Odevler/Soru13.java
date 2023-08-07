package Udemy.Odevler;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki integer değerin en büyük ortak bölenini bulan uygulamayı yazınız

        Scanner scanner=new Scanner(System.in);

        int kontrol=1;
        int ebob=1;
        System.out.println("1. Sayıyı giriniz: ");
        int sayi1=scanner.nextInt();
        System.out.println("2.Sayyıyı giriniz: ");
        int sayi2=scanner.nextInt();
        while (kontrol<=sayi1&&kontrol<=sayi2){

            if (sayi1%kontrol==0&&sayi2%kontrol==0){
                ebob=kontrol;}
           kontrol++;

        }
        System.out.println(sayi1+" ve "+sayi2+" ebobu= "+ebob);
    }
}
