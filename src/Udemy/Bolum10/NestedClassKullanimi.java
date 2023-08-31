package Udemy.Bolum10;

public class NestedClassKullanimi {
    YaziciSinif nesne=new YaziciSinif();

    public static void main(String[] args) {
        String[] isimler={"yaso","taso","maso"};
        YaziciSinif.diziyazdir nesne1=new YaziciSinif().new diziyazdir();
        nesne1.diziyazdir(isimler);
        nesne1.metotlariyazdir();


    }

}
