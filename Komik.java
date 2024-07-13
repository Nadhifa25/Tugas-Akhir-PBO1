public class Komik extends Buku{
    private int volume;
   
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void naikkanHarga(double kenaikan) {
        double hargaSekarang = getHarga();
        setHarga(hargaSekarang + kenaikan);
    }

    public void naikkanHarga() {
        double kenaikan = 10000; // Kenaikan harga khusus untuk komik
        setHarga(getHarga() + kenaikan);
    }
    
}