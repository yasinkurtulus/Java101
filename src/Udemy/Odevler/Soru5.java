package Udemy.Odevler;

public class Soru5 {
    public static void main(String[] args) {
        //1'den 10'a kadar olan sayıları aralarında virgül olacak şekilde for döngüsü ile yazdırınız
        for (int i=1;i<=10;i++)
        {

            if (i==10)
                System.out.println(i);
            else
                System.out.print(i+",");
        }
    }
}
