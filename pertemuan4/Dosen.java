public class Dosen {

    private String nip;
    private String nama;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public class Jurusan {
        private String namaJurusan;
        private Dosen dosen;

        public Jurusan(String namaJurusan) {
            this.namaJurusan = namaJurusan;
        }

        public void setDosen(Dosen dosen) {
            this.dosen = dosen;
        }

        public String getNamaJurusan() {
            return namaJurusan;
        }

        public Dosen getDosen() {
            return dosen;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
}
