public class HitungGaji {
    // Deklarasikan variabel anggota private untuk menyimpan gaji kotor (gross
    // salary)
    // dan potongan (deductions)
    private double gajiKotor;
    private double potongan = 75000.00; // Potongan tetap sebesar 75000.00

    // Method untuk mengatur gaji kotor
    public void setGajiKotor(double gajiKotor) {
        this.gajiKotor = gajiKotor;
    }

    // Method untuk menghitung gaji bersih (net salary)
    public double hitungGajiBersih() {
        // Hitung gaji setelah pajak (20% dari gaji kotor)
        double gajiSetelahPajak = gajiKotor * 0.8;

        // Hitung gaji bersih (gaji setelah pajak dikurangi potongan)
        double gajiBersih = gajiSetelahPajak - potongan;

        return gajiBersih;
    }
}
