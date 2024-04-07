class SepedaGunung extends Sepeda {
    @Override
    void ubahGir(int pertambahanGir) {
        gir = 2 * (gir + pertambahanGir);
        System.out.println("Gir: " + gir);
    }
}

public class SepedaGunungAction {
    public static void main(String[] args) {
        SepedaGunung sepedaku = new SepedaGunung();
        sepedaku.tambahKecepatan(10);
        sepedaku.ubahGir(1);
    }
}