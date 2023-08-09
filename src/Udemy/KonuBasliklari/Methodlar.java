package Udemy.KonuBasliklari;

import java.util.Scanner;

public class Methodlar {
    //Method kullanarak menu tasarlayalım
  static Scanner scanner=new Scanner(System.in);
  static int c=5;
    public static void main(String[] args) {

        while (true){
            int secim=menu();
            if (secim==0)
                break;;
            switch (secim){
                    case 1: System.out.println("1.Sayıyı giriniz: ");
                        int sayi1=scanner.nextInt();
                        System.out.println("2.Sayıyı giriniz: ");
                        int sayi2=scanner.nextInt(); topla(sayi1,sayi2);break;
                case 2:System.out.println("1.Sayıyı giriniz: ");
                     sayi1=scanner.nextInt();
                    System.out.println("2.Sayıyı giriniz: ");
                     sayi2=scanner.nextInt();
                    System.out.println(carp(sayi1,sayi2));break;
                case 3:System.out.println("1.Sayıyı giriniz: ");
                     sayi1=scanner.nextInt();
                    System.out.println("2.Sayıyı giriniz: ");
                     sayi2=scanner.nextInt();
                    System.out.println(kuvvetAl(sayi1,sayi2));break;
                default:
                    System.out.println("Yanlış tuşlama yaptınız baştan deneyin");
                    break;
                }
        }
    }
    public static int menu(){
        System.out.println("***Menu***");
        System.out.println("1-İki sayıyı topla");
        System.out.println("2-İki sayıyı çarp");
        System.out.println("3-Sayının kuvvetini al");
        System.out.println("Çıkmak için 0 tuşlayın");
         int secim=scanner.nextInt();
         return secim;
    }
    public static void topla(int a, int b){
        System.out.println(a+b);
    }
    public static int carp(int a, int b){
        return a*b;
    }
    public static double kuvvetAl(int a,int b){
        double sonuc=Math.pow(a,b);
        return sonuc;
    }

}
