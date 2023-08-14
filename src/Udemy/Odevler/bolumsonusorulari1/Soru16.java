package Udemy.Odevler.bolumsonusorulari1;

public class Soru16 {
    public static void main(String[] args) {
        /*1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 =? işleminin sonucunu bulan java
          projesini yazınız.*/
        int artis=0;
        Boolean artıyormu=true;
        int toplam=0;
        for (int i=1;i<=35;i+=artis)
        {
            System.out.print(i+"+");
            toplam+=i;
            if (artis==1)
                artıyormu=true;
            else if (artis==5) {
                artıyormu=false;
            }
            if (artıyormu)
                artis++;
            else
                artis--;

        }
        System.out.println("="+toplam);

    }
}
