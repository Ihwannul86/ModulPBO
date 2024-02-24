import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String Kelamin = scan.nextLine();
        String artikelamin = Kelamin.equalsIgnoreCase("L") ? "Laki-laki Tulen" : "Perempuan Tulen";

        System.out.print("Masukkan tanggal lahir (thn-bln-tgl) (YYYY-MM-DD): ");
        String tanggalLahir = scan.nextLine();
        LocalDate lahir = LocalDate.parse(tanggalLahir);
        LocalDate sekarang = LocalDate.now();
        int umur = Period.between(lahir, sekarang).getYears();

        System.out.println("\nData Diri:");
        System.out.println("Nama saya: " + nama);
        System.out.println("Jenis Kelamin saya: " + artikelamin);
        System.out.println("Umur saya : " + umur + " tahun");

        scan.close();
    }
}