public class PrimitifConversionAssignment2 {
    public static void main(String[] args) {
        double d;
        short s;
        d = 1.2345;
        s = (short) d; // Assign a double to a short variable, added type casting
        System.out.print("Nilai d: " + s);
    }
}