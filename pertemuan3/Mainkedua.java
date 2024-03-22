public class Mainkedua {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        // Mengakses anggota public dari KelasA
        System.out.println(kelasA.getMemberA());
        System.out.println(kelasA.functionA());

        KelasB kelasB = new KelasB();
        kelasB.methodC(); // Memanggil methodC() yang protected
    }
}
