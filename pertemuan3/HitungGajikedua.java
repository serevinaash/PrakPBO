public class HitungGajikedua {
    // Deklarasikan variabel anggota private untuk menyimpan nim, nama, umur,
    // alamat, dan nomor telepon
    private String nim, name, address, phoneNo;
    private byte age;

    // Method untuk mengatur nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method untuk mendapatkan nim
    public String getNim() {
        return nim;
    }

    // Method untuk mengatur nama
    public void setName(String name) {
        this.name = name;
    }

    // Method untuk mendapatkan nama
    public String getName() {
        return name;
    }

    // Method untuk mengatur umur
    public void setAge(byte age) {
        this.age = age;
    }

    // Method untuk mendapatkan umur
    public byte getAge() {
        return age;
    }

    // Method untuk mengatur alamat
    public void setAddress(String address) {
        this.address = address;
    }

    // Method untuk mendapatkan alamat
    public String getAddress() {
        return address;
    }

    // Method untuk mengatur nomor telepon
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Method untuk mendapatkan nomor telepon
    public String getPhoneNo() {
        return phoneNo;
    }

    // Anda dapat menambahkan method lain sesuai kebutuhan di sini
}
