import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Penjualan implements Transaksi{

    Date hariSekarang = new Date();
    SimpleDateFormat tanggal = new SimpleDateFormat("E, dd/MM/yyy");
    SimpleDateFormat waktu = new SimpleDateFormat("HH:mm:ss zzz");

    public String faktur;
    public String namaPelanggan;
    public String noHp;
    public String alamat;
    public String kodeBarang;
    public String namaBarang;
    public int hargaBarang;
    public int jumlahBeli;
    public String namaKasir;
    public int totalBayar;
    
    public Penjualan(){
        inputFaktur();
        inputPelanggan();
        inputBarang();
        hitungTotalBayar();
        inputKasir();
    }

    @Override
    public void inputFaktur(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan nomor faktur : ");
        faktur = scanner.nextLine();
    }

    @Override
    public void inputPelanggan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan nama pelanggan : ");
        namaPelanggan = scanner.nextLine();
        System.out.print("\nMasukkan nomor HP : ");
        noHp = scanner.nextLine();
        System.out.print("\nMasukkan alamat : ");
        alamat = scanner.nextLine();
    }

    @Override
    public void inputBarang(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan kode barang : ");
        kodeBarang = scanner.nextLine();
        System.out.print("\nMasukkan nama barang : ");
        namaBarang = scanner.nextLine();
        System.out.print("\nMasukkan harga barang : ");
        hargaBarang = scanner.nextInt();

        try{
            System.out.print("\nMasukkan jumlah beli : ");
            jumlahBeli = scanner.nextInt();

            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("\nJumlah beli harus lebih dari 0");
            } else if (jumlahBeli > 100){
                throw new IllegalArgumentException("\nJumlah beli melebihi stok barang");
            }
        } catch (Exception e){
            System.err.println("\nError : " + e.getMessage());
        }
    }

    @Override
    public void hitungTotalBayar(){
        totalBayar = jumlahBeli*hargaBarang;
    }

    @Override
    public void inputKasir(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan nama kasir : ");
        namaKasir = scanner.nextLine();
    }

    public void tampilkanTransaksi(){
        System.out.println();
        System.out.println("                   MINIMARKET NYAINIM                    ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Tanggal\t : " + tanggal.format(hariSekarang));
        System.out.println("Waktu\t : " + waktu.format(hariSekarang));
        System.out.println("=========================================================");
        System.out.println("                     DATA PELANGGAN                      ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Nomor faktur\t : " + faktur);
        System.out.println("---------------------------------------------------------");
        System.out.println("Nama Pelanggan\t : " + namaPelanggan.toUpperCase());
        System.out.println("Nomor HP\t : " + noHp);
        System.out.println("Alamat\t\t : " + alamat.toLowerCase());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                 DATA PEMBELIAN BARANG                   ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Kode barang\t : " + kodeBarang);
        System.out.println("Nama barang\t : " + namaBarang.toUpperCase());
        System.out.println("Jumlah beli\t : " + jumlahBeli);
        System.out.println("Harga Barang\t : " + hargaBarang);
        System.out.println("TOTAL BAYAR\t : " + totalBayar);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir\t\t : " + namaKasir.toUpperCase());
    }


    
}
