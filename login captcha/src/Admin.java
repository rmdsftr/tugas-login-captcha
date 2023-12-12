import java.util.Scanner;

public class Admin {
    private String username = "Nyainim09";
    private String password = "MoshiMoshi12";
    private String captcha = "xyFG16J8b";
    public String nama;
    public String sandi;
    public String kode;

    Scanner scanner = new Scanner(System.in);

    public void login(){
        System.out.print("Masukkan Username : ");
        nama = scanner.nextLine();
        System.out.print("\nMasukkan Password : ");
        sandi = scanner.nextLine();

        if (nama.equals(username) || sandi.equals(password)){
            captcha();
        } else {
            System.out.println("Username atau Password salah");
        }

    }

    public void captcha(){
        System.out.println("\nkode captcha : " + captcha);
        System.out.print("salin kode captcha di atas jika anda bukan robot : ");
        kode = scanner.nextLine();

        if (kode.equalsIgnoreCase(captcha)){
            System.out.println();
            System.out.println("=====================================");
            System.out.println("SELAMAT DATANG DI MINIMARKET NYAINIM");
            System.out.println("=====================================");
            System.out.println("Login admin");
            System.out.println("Username\t : " + nama);
            System.out.println("Password\t : " + sandi);
            System.out.println();
            System.out.println("Verifikasi pengguna");
            System.out.println("Kode captcha\t : " + captcha);
            System.out.println("Entry captcha\t : " + kode);
            System.out.println("======================================");
            System.out.println();

            Penjualan penjualan1 = new Penjualan();
            penjualan1.tampilkanTransaksi();
        } else {
            System.out.println("\nAnda bukan manusia!!!");
        }
    }
}
