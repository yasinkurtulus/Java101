package Udemy.Odevler.VizeSorulari;

public class VizeSoru1 {
    public static void main(String[] args) {
        /*SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
          Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.*/
        int[][]matris=new int[5][5];
        matrisolustur(matris);
        caprazelemantoplami(matris);


    }

    private static void caprazelemantoplami(int[][]dizi) {
        int birincicapraztoplami=0;
        int ikincicapraztoplami=0;
        for (int i=0,j=dizi[i].length-1;i< dizi.length;i++,j--) {
            birincicapraztoplami+=dizi[i][i];
            ikincicapraztoplami+=dizi[i][j];
        }
        System.out.println("Çapraz elemanlar toplamı: "+(ikincicapraztoplami+birincicapraztoplami));
    }

    public static void matrisolustur(int[][]dizi){
        for (int satır=0;satır<dizi.length;satır++){
            for (int sutun=0;sutun<dizi[satır].length;sutun++){
                int randomsayi=(int)(Math.random()*10);
                dizi[satır][sutun]=randomsayi;
                System.out.print(dizi[satır][sutun]+" | ");
            }
            System.out.println((satır+1)+"ncı satır ");

        }

    }
}
