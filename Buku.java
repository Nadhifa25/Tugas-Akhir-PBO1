public class Buku{
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public void judul(){
        System.out.println("Ini method judul");
    }

    public void penulis(){
        System.out.println("Ini method penulis");
    }

    public void jumlahHalaman(){
        System.out.println("Ini method Jumlah Halaman");
    }

    public void harga(){
        System.out.println("Ini method harga");
    }

    public int getId(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public Buku(){
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public void naikkanHarga(double kenaikan) {
        this.harga = this.harga + kenaikan;
    }

    public void hapus(){
        System.out.println("DELETE FROM Buku");
    }
        
    public void hapus(int id){
        System.out.println("DELETE FROM Buku WHERE id=" + id);
    }

}