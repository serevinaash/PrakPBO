public class LaptopToshiba extends Laptop {
    // constructor
    LaptopToshiba(String merk) {
        setMerk(merk);
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    protected String getPemilik() {
        return this.pemilik;
    }

    protected void tampil() {
        System.out.println(getPemilik() + " memiliki laptop merk " + getMerk());
    }

    protected void hapus() {
        merk = null;
        pemilik = null;
    }
}