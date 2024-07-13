public class Skincare {
    private String nama;
    private String merek;
    private String jenis;
    private String tanggalProduksi;
    private double harga;

    public void nama(){
        System.out.println("Ini method untuk Nama");
    }
    

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getMerek(){
        return this.merek;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getTanggalProduksi(){
        return this.tanggalProduksi;
    }

    public void setTanggalProduksi(String tanggalProduksi){
        this.tanggalProduksi = tanggalProduksi;
    }
    public double getHarga(){
        return this.harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public Skincare(){
        System.out.println("Ini method constructor");
    }

    public void update(){
        System.out.println("UPDATE FROM skincare");
    }

    public void update(String nama){
        System.out.println("UPDATE FROM skincare WHERE nama= "+nama);
    }
}
