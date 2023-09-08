package Udemy.Bolum11.VeterinerSim;

abstract public class Kisi {
    private String isim;
    private int id;

    public Kisi(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    abstract public void bilgilerigoster();
}
