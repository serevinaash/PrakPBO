public class MultiFunctionDevice implements Printer, Scanner, Fax {
    @Override
    public void print(Document d) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax(Document d) {
        System.out.println("Sending fax...");
    }
}
