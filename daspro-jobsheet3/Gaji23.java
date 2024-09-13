import java.util.Scanner;

public class Gaji23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiSebelumPajak = jamKerja * upahPerjam;
        double bonus = 0.10 * gajiSebelumPajak;
        double totalGajiSebelumPajak = gajiSebelumPajak + bonus;
        double pajak = 0.05 * totalGajiSebelumPajak;
        double gajiSetelahPajak = totalGajiSebelumPajak - pajak;

        System.out.println("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();
        System.out.println("Masukkan upah perjam: ");
        double upahPerjam = input.nextDouble();

        System.out.println(" Gaji sebelum pajak: " + gajiSebelumPajak);
        System.out.println(" Bonus : Rp " + bonus);
        System.out.println("Total gaji sebelum pajak :" + totalGajiSebelumPajak);
        System.out.println("Pajak : Rp " +pajak);
        System.out.println("Gaji Setelah pajak: Rp" + gajiSetelahPajak);

        scanner.close();
        

    }
}