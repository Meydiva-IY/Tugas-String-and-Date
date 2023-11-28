public abstract class Member {
    // Atribut 
    protected Integer poin = 0;
    String namaPelanggan;
    String nomorFaktur;
    String namaBarang;
    String nomorHp;
    Integer hargaBarang;
    Integer jumlahBarang;
    Integer totalBayar;

    // Method
    public Integer getPoin(){
        return poin;
    }

    // Constructor
    public Integer redeemPoin(Integer hargaSouvenir){
        return this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}
