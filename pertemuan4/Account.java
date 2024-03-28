public class Account {
    /*
     * The owner field is initialized
     * during the constructor and
     * never modified.
     */
    private Advertiser owner;

    public Account(Advertiser owner) {
        this.owner = owner;
    }

    public Advertiser getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        Advertiser advertiser = new Advertiser();
        Account account = advertiser.getAccount();
        System.out.println(account.getOwner());
    }
}

class Advertiser {

    private final Account account; // Use final for immutability

    public Advertiser() {
        account = new Account(this); // Pass 'this' as argument to the Account constructor
    }

    public Account getAccount() {
        return account;
    }
}
