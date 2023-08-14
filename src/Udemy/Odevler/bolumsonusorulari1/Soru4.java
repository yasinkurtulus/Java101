package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //belli aralıktaki 2 sayının arasında bulunan sayıların toplamını yazdırınız
        int altsınır=scanner.nextInt();
        int ustsınır=scanner.nextInt();
        int sonuc=0;
        for ( ;altsınır<=ustsınır;altsınır++){
            sonuc+=altsınır;
        }
        System.out.println(sonuc);
    }
}

