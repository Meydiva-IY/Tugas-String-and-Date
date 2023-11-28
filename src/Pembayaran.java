// Menggunakan scanner
import java.util.Scanner;

public class Pembayaran {
    public static void main(String[] args) {
    // Polimorphisme
    Member member =new MemberReguler(10);
    System.out.println("Poin member1 adalah : " + member .getPoin());
    System.out.println("");
    Scanner scanner = new Scanner(System.in);

    try {
        // Input Atribut dengan scanner  
        Member tes1 = new Member(){};

        System.out.print("Masukkan No. Faktur: ");
        tes1.nomorFaktur = scanner.nextLine();

        System.out.print("Masukkan Nama Pelanggan: ");
        tes1.namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan No. Hp: ");
        tes1.nomorHp = scanner.nextLine();

        System.out.println("Detail Pembayaran");
        System.out.print("Masukkan Nama Barang: ");
        tes1.namaBarang = scanner.nextLine();

        System.out.print("Masukkan Harga Barang: ");
        tes1.hargaBarang = scanner.nextInt();

        System.out.print("Masukkan Jumlah Barang: ");
        tes1.jumlahBarang = scanner.nextInt();

        // Menghitung total bayar
        tes1.totalBayar = tes1.hargaBarang * tes1.jumlahBarang;

        // Menampilkan hasil dalam bentuk nota 
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("No. Faktur: " + tes1.nomorFaktur);
        System.out.println("Nama Pelanggan: " + tes1.namaPelanggan);
        System.out.println("No. HP: " + tes1.nomorHp);
        System.out.println("Detail Pembayaran");
        System.out.println("Nama Barang: " + tes1.namaBarang);
        System.out.println("Harga Barang: " + tes1.hargaBarang);
        System.out.println("Jumlah Barang: " + tes1.jumlahBarang);
        System.out.println("Total Bayar: " + tes1.totalBayar);
        System.out.println("-------------------------");

    } catch (java.util.InputMismatchException e) {
    // Jika terjadi error pada inputan atribut
    System.out.println("Maaf, input tidak valid. Tolong input kembali dengan menggunakan numerik untuk harga dan jumlah barang.");
    } finally {
    // Menutup scanner setelah selesai digunakan
    scanner.close();
            }
        }
    }