public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        // Menggunakan pencetak
        SimplePrinter printer = new SimplePrinter();
        printer.print(document);

        // Menggunakan pemindai
        SimpleScanner scanner = new SimpleScanner();
        scanner.scan(document);

        // Menggunakan faks
        SimpleFax fax = new SimpleFax();
        fax.fax(document);
    }
}