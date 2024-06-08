public class Main {
    public static void main(String[] args) {
        Document document = new Document("My Document", "This is the content of the document.");

        // Menggunakan SimplePrinter
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print(document);

        // Menggunakan SimpleScanner
        Scanner simpleScanner = new SimpleScanner();
        simpleScanner.scan(document);

        // Menggunakan SimpleFax
        Fax simpleFax = new SimpleFax();
        simpleFax.fax(document);

        // Menggunakan MultiFunctionDevice
        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
        multiFunctionDevice.print(document);
        multiFunctionDevice.scan(document);
        multiFunctionDevice.fax(document);
    }
}
