#include <iostream>
using namespace std;

int main() {
    // Array satu dimensi untuk menyimpan nama-nama hari
    string hari[3] = {"Senin", "Selasa", "Rabu"};

    // Array dua dimensi untuk menyimpan jadwal kegiatan
    string jadwal[3][3] = {
        {"Belajar C++", "Makan Siang", "Olahraga"},
        {"Belajar Java", "Makan Siang", "Bermain Game"},
        {"Belajar Python", "Makan Siang", "Baca Buku"}
    };

    char ulangi;
    do {
        // Menampilkan jadwal kegiatan selama seminggu
        cout << "Jadwal Kegiatan Minggu Ini:" << endl;
        for (int i = 0; i < 3; i++) {
            cout << hari[i] << ": ";
            for (int j = 0; j < 3; j++) {
                cout << jadwal[i][j];
                if (j < 2) {
                    cout << ", ";
                }
            }
            cout << endl;
        }

        // Meminta input dari pengguna
        int pilihan;
        cout << "Pilih hari (1-3): ";
        cin >> pilihan;

        // Memeriksa apakah pilihan hari valid
        if (pilihan >= 1 && pilihan <= 3) {
            pilihan--; // Mengubah pilihan menjadi indeks array

            // Menampilkan jadwal kegiatan untuk hari yang dipilih
            cout << "Jadwal kegiatan untuk " << hari[pilihan] << ":" << endl;
            for (int j = 0; j < 3; j++) {
                cout << jadwal[pilihan][j] << endl;
            }
        } else {
            cout << "Pilihan hari tidak valid." << endl;
        }

        // Loop do-while sederhana untuk mengulangi permintaan pengguna
        cout << "Apakah Anda ingin melihat jadwal kegiatan lagi? (y/n): ";
        cin >> ulangi;
    } while (ulangi == 'y' || ulangi == 'Y');

    cout << "Terima kasih!" << endl;

    return 0;
}

