import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pembayaran extends Member implements iTotalBayar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan No Hp: ");
            String noHp = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            long hargaBarang = scanner.nextLong();
            System.out.print("Masukkan Jumlah Beli: ");
            Long jumlahBeli = scanner.nextLong();
            System.out.println("");
            long totalBayar = hargaBarang * jumlahBeli;

            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a z");

            System.out.println("");
            System.out.println("----------- MY MINIMARKET -----------");
            System.out.println("Tanggal Transaksi : " + dateFormat.format(date));
            System.out.println("Jam : " + timeFormat.format(date));
            System.out.println("No Faktur : " + noFaktur);
            System.out.println("====================================");
            System.out.println("---------- DATA PELANGGAN ----------");
            System.out.println("Nama Pelanggan \t: " + namaPelanggan.toUpperCase());
            System.out.println("No HP \t\t: " + noHp);
            System.out.println("Alamat \t\t: " + alamat);
            System.out.println("------ DATA PEMBELIAN BARANG -------");
            System.out.println("Nama Barang \t: " + namaBarang);
            System.out.println("Harga Barang \t: " + hargaBarang);
            System.out.println("Jumlah Beli \t: " + jumlahBeli);
            System.out.println("Total Bayar \t: " + totalBayar);
            System.out.println("------------------------------------");
            System.out.println("Kasir \t\t: Meydiva Intayeza");
 
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Pastikan input data sesuai dengan tipe data yang benar.");
        } finally {
            scanner.close();
        }
    }
}