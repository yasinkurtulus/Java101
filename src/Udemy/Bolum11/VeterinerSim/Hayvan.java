package Udemy.Bolum11.VeterinerSim;
abstract public class Hayvan {
    private String dogumYili;
    private String isim;



    public Hayvan(String dogumYili, String isim){
        this.isim = isim;
        this.dogumYili=dogumYili;
    }
    abstract  void asiyap();
    abstract void bilgilerigoster();



    public String getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(String dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
