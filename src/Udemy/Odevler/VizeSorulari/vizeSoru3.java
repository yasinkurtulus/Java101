package Udemy.Odevler.VizeSorulari;

import java.util.Arrays;
import java.util.Scanner;

public class vizeSoru3 {
    public static void main(String[] args) {
        /*küçük xlerle büyük X şekli çizen programı yazınız.
          Mesela satır sayısı olarak 5 alan program şunu yazmalı*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Satır sayısı giriniz(Tek sayı olmalı): " );
        int satirsayisi=scanner.nextInt();
        char[][]matris=new char[satirsayisi][satirsayisi];
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                matris[i][j]=' ';
            }
        }
              sekliciz(matris);
        matrisyazdir(matris);

    }
    public static void sekliciz(char[][]matris){
        for (int i=0,j=matris[i].length-1;i<matris.length;i++,j--){
            matris[i][i]='X';
            matris[i][j]='X';

        }
    }
    public static void matrisyazdir(char[][]matris){
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]);
            }
            System.out.println(" ");
        }
    }
}
