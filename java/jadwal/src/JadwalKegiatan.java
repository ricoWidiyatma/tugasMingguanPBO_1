import java.util.Scanner;

public class JadwalKegiatan {
    public static void main(String[] args) {
        // Array satu dimensi untuk menyimpan nama-nama hari
        String[] hari = {"Senin", "Selasa", "Rabu"};

        // Array dua dimensi untuk menyimpan jadwal kegiatan
        String[][] jadwal = {
                {"Belajar C++", "Makan Siang", "Olahraga"},
                {"Belajar Java", "Makan Siang", "Bermain Game"},
                {"Belajar Python", "Makan Siang", "Baca Buku"},
        };

        Scanner scanner = new Scanner(System.in);
        char ulangi;
        do {
            // Menampilkan jadwal kegiatan selama seminggu
            System.out.println("Jadwal Kegiatan Minggu Ini:");
            for (int i = 0; i < 3; i++) {
                System.out.print(hari[i] + ": ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(jadwal[i][j]);
                    if (j < 2) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }

            // Meminta input dari pengguna
            int pilihan;
            System.out.print("Pilih hari (1-3): ");
            pilihan = scanner.nextInt();

            // Memeriksa apakah pilihan hari valid
            if (pilihan >= 1 && pilihan <= 3) {
                pilihan--; // Mengubah pilihan menjadi indeks array

                // Menampilkan jadwal kegiatan untuk hari yang dipilih
                System.out.println("Jadwal kegiatan untuk " + hari[pilihan] + ":");
                for (int j = 0; j < 3; j++) {
                    System.out.println(jadwal[pilihan][j]);
                }
            } else {
                System.out.println("Pilihan hari tidak valid.");
            }

            // Loop do-while sederhana untuk mengulangi permintaan pengguna
            System.out.print("Apakah Anda ingin melihat jadwal kegiatan lagi? (y/n): ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
    }
}
