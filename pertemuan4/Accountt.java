import java.util.HashSet;
import java.util.Set;

public class Accountt {
    private Advertiserr owner;

    public void setOwner(Advertiserr newOwner) {
        if (owner != newOwner) {
            Advertiserr oldOwner = owner;
            owner = newOwner;

            // Update account ownership in Advertiserr objects (if applicable)
            if (newOwner != null) {
                newOwner.addAccount(this);
            }
            if (oldOwner != null) {
                oldOwner.removeAccount(this);
            }
        }
    }
}

class Advertiserr {
    private Set<Accountt> accounts;

    public Advertiserr() {
        accounts = new HashSet<>();
    }

    public void addAccount(Accountt a) {
        accounts.add(a);
        a.setOwner(this); // Menghubungkan kembali Accountt ke Advertiserr saat ditambahkan
    }

    public void removeAccount(Accountt a) {
        accounts.remove(a);
        a.setOwner(null); // Menghapus hubungan Advertiserr dari Accountt saat dihapus
    }
}
