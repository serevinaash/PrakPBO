public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0; x < 5; x++) {
            new Perhitungan(); // Ini akan memanggil constructor dan meningkatkan nilai
        }

        // Tidak perlu membuat objek Perhitungan, karena nilai dan getNilai bersifat
        // static
        System.out.println("Sampai " + Perhitungan.nilai);

        // Panggil method getNilai langsung dari kelas Perhitungan
        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
