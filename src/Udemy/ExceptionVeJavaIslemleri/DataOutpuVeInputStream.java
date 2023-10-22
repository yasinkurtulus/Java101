package Udemy.ExceptionVeJavaIslemleri;

import java.io.*;

public class DataOutpuVeInputStream {
    public static void main(String[] args) {
        dosyayaz();
        dosyaoku();
    }

    private static void dosyaoku() {
        DataInputStream dataInputStream = null;
        boolean dosyaoku=true;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenci.dat")));
            while (dosyaoku){
                try {
                    String isim=dataInputStream.readUTF();
                    int id=dataInputStream.read();
                    boolean aktiflik=dataInputStream.readBoolean();
                    Ogrenci okunanogrenci=new Ogrenci(isim,id,aktiflik);
                    System.out.println(okunanogrenci);
                }
                catch (EOFException e){
                    System.out.println(e);
                    dosyaoku=false;
                }

            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }

    }

    private static void dosyayaz() {
        DataOutputStream dataOutputStream=null;
        try {
            dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenci.dat")));
            Ogrenci ogr1=new Ogrenci("Yasin",12,true);
            Ogrenci ogr2=new Ogrenci("Bilal",52,false);
            dataOutputStream.writeUTF(ogr1.isim);
            dataOutputStream.write(ogr1.id);
            dataOutputStream.writeBoolean(ogr1.aktiflik);

            dataOutputStream.writeUTF(ogr2.isim);
            dataOutputStream.write(ogr2.id);
            dataOutputStream.writeBoolean(ogr2.aktiflik);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dataOutputStream!=null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
class Ogrenci{
    String isim;
    int id;
    boolean aktiflik;

    public Ogrenci(String isim, int id, boolean aktiflik) {
        this.isim = isim;
        this.id = id;
        this.aktiflik = aktiflik;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", id=" + id +
                ", aktiflik=" + aktiflik +
                '}';
    }
}
