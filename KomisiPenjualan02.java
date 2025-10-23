import java.util.Scanner;

public class KomisiPenjualan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //masukkan jumlah uang dalam bentun Rp. (Rupiah)
        System.out.print("Masukkan omzet bulanan\t: ");
        double omzet = sc.nextDouble();

        //rating kinerja 1-100
        System.out.print("Masukkan rating kinerja\t: ");
        int ratingKinerja = sc.nextInt();

        //sertifikasi nasional diinisialisasi dengan jawaban (ya/tidak)
        System.out.print("Apakah pekerja memiliki sertifikasi profesional?\t: ");
        String sertifikasiNasional = sc.next();


        double persentase = 0.0;
        if (ratingKinerja >= 70) {
            if (omzet < 50_000_000) {
                persentase = 1.0;
            } else if (omzet < 100_000_000) {
                persentase = 2.0;
            } else {
                persentase = 3.0;
            }
            if (ratingKinerja >= 90) {
                persentase += 1.0;
            }
        } 

        //menghitung komisi uang
        double komisi = (persentase / 100.0) * omzet;

        //bonus sertifikasi
        double bonus = 0.0;
        if (ratingKinerja >= 70 && sertifikasiNasional.equalsIgnoreCase("ya")) {
            bonus = 500_000;
        }

        //total
        double totalPembayaran = komisi + bonus;

        //rincian penghitungan komisi
        System.out.println("----- Rincian Komisi -----");
        System.out.printf("Omzet\t\t\t: Rp %.0f%n", omzet);
        System.out.printf("Rating\t\t\t: %d%n", ratingKinerja);
        System.out.printf("Punya sertifikasi\t: %s%n", sertifikasiNasional.equalsIgnoreCase("ya") ? "Ya" : "Tidak");
        System.out.printf("Persentase komisi\t: %.1f%%%n", persentase);
        System.out.printf("Komisi\t\t\t: Rp %.0f%n", komisi);
        System.out.printf("Bonus sertifikasi\t: Rp %.0f%n", bonus);
        System.out.printf("Total pembayaran\t: Rp %.0f%n", totalPembayaran);

    }
    
}
