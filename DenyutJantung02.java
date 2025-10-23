import java.util.Scanner;

public class DenyutJantung02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // memasukkan umur seseorang yang akan dihitung
        System.out.print("Masukkan usia : ");
        int usia = sc.nextInt();
        if (usia < 10 || usia > 100) {
            System.out.println("Usia tidak masuk akal. Masukkan usia diantara 10 sampai 100 tahun");
        }

        // menginput denyut jantung HR
        System.out.print("Masukkan denyut jantung saat latihan : ");
        int HR = sc.nextInt();
        if (HR <= 0) {
            System.out.println("Denyut jantung haru spositif");
        }

        // menghitung MHR
        int MHR = 220 - usia;
        double persentase = ((double) HR / MHR) * 100.0;

        // kualifikasi sesuai dengan presentase MHR
        String kategori;
        String saran;

        if (persentase < 50.0) {
            kategori = "Sangat ringan atau sedang pemanasan";
            saran = "Manfaat minimal";
        } else if (persentase < 60.0) {
            kategori = "Ringan";
            saran = "Peningkatan dasar kebugaran";
        } else if (persentase < 70.0) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman";
        } else if (persentase < 85.0) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi";
        } else {
            kategori = "Sangat berat";
            saran = "Risiko bagi pemula, batasi durasi";
        }
        System.out.println("------ Hasil ======");
        System.out.println("Usia\t\t\t: " + usia + " tahun");
        System.out.println("Denyut jantung (HR)\t: " + HR + " bpm");
        System.out.println("MHR (220 - usia)\t: " + MHR + " bpm");
        System.out.printf("Persentase MHR\t\t: %.1f%%\n", persentase);
        System.out.println("Kategori intensitas\t: " + kategori);
        System.out.println("Saran\t\t\t: " + saran);
    }

}
