import java.util.Scanner;

public class Siakad23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukkan nama:");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM:");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas:");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen:");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis:");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian:");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;

        System.out.println("Nama: " + nama);
        System.out.println("NIM:" + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Mahasiswa dengan nama " + nama +" (NIM " + nim + ")  kelas " + kelas +" nomor absen " + absen );
    }
}