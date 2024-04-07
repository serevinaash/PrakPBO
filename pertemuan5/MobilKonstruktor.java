public class MobilKonstruktor {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Biru", 2009);
        mobilku.info(); // Panggil method info dengan ()

        Mobil mobilmu = new Mobil();
        mobilmu.info(); // Panggil method info dengan ()
    }
}
