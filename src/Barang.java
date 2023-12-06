public class Barang {
    String kodeBarang;
    String namaBarang;
    String namaPegawai;
    Long hargaBarang;
    Long stok;
    public Barang(String kodeBarang, String namaBarang, long hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }
}