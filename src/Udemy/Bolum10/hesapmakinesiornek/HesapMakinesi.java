package Udemy.Bolum10.hesapmakinesiornek;

public class HesapMakinesi {
    int topla(int i,int j){
        Topla t=new Topla();
        return t.topla(i,j);
    }
    int cıkar(int i, int j){
        Cıkar c=new Cıkar();
        return c.cıkar(i,j);
    }
    String bol(int i, int j){
         class Bol {
             private String bol(int i, int j) {
                 if (j == 0) {
                     return "Bölünmez";
                 } else {
                     int sonuc = i / j;
                     return String.valueOf(sonuc);
                 }
             }
         }
         Bol b=new Bol();
         return b.bol(i,j);
    }
    private class Topla{
        private int topla(int i,int j) {
            return i+j;
        }
    }
    private class Cıkar{
        private int cıkar(int i,int j){
            return i-j;
        }
    }
    public class Carp{
         int carp(int i,int j){
            return i*j;
        }
    }

}
