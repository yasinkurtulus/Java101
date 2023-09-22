package Udemy.UdemyCoursePlayer;

public abstract class Kisi {
    private String isim;
    private String rol;

    public Kisi(String isim, String rol) {
        this.isim = isim;
        this.rol = rol;
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
