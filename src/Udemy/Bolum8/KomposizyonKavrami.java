package Udemy.Bolum8;

public class KomposizyonKavrami {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.Hareketegec();
        araba1.Dur();
        araba1.ozellikYazdır();


    }
}
class Motor{
    private int beygirgücü;
    private String marka;
    public Motor(String marka,int beygirgücü){
        System.out.println("Motor üretiliyor");
        this.beygirgücü=beygirgücü;
        this.marka= marka;
    }
    public void Motorcalisiyor(){
        System.out.println("Motor çalıştı");
    }
    public void Motorduruyor(){
        System.out.println("Motor Durdu");
    }

    public int getBeygirgücü() {
        return beygirgücü;
    }

    public String getMarka() {
        return marka;
    }
}
class Araba{

  private   Motor motor1;
  private   String renk;
  private   String marka;
  private int uretimyili;

  public Araba(){
      System.out.println("Araba oluşturuluyor");
      motor1=new Motor("h256",785);

      marka="AxDC";
      renk="siyah";
      uretimyili=2020;
  }
  public void Hareketegec(){
      motor1.Motorcalisiyor();
      System.out.println("Harakete geçiyor");
  }
  public void Dur(){
      motor1.Motorduruyor();
      System.out.println("Araç duruyor");
  }
  public void ozellikYazdır(){
      System.out.println(marka+"Marka araba "+motor1.getMarka()+" marka motora sahip. Motor gücü"+motor1.getBeygirgücü()+" beygir");
      System.out.println("Araba rengi "+renk+" Üretim yılı "+uretimyili);
  }


}

