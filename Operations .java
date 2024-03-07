public class Operations {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Integer Division - results truncated:");
        System.out.println("10 / 3 \t = " + (10 / 3));
        System.out.println("10 / -3 \t = " + (10 / -3));
        System.out.println("-10 / 3 \t = " + (-10 / 3));

        System.out.println();
        System.out.println("Floating-point Division by 0: ");
        System.out.println("10.34 / 0 \t = " + (10.34 / 0));
        System.out.println("-10.34 / 0 \t = " + (-10.34 / 0));
        System.out.println("10.34 / -0 \t = " + (10.34 / -0));
        System.out.println("0.0 / 0 \t = " + (0.0 / 0));
        System.out.println("0.0 / -0 \t = " + (0.0 / -0));

        /** Modulo **************************************************/
        System.out.println();
        System.out.println("Modulo operations: ");
        System.out.println("5 % 3 \t = " + (5 % 3));
        System.out.println("-5 % 3 \t = " + (-5 % 3));
        System.out.println("5 % -3 \t = " + (5 % -3));
        System.out.println("5.0 % 3 \t = " + (5.0 % 3));
        System.out.println("5.0 % -3 \t = " + (5.0 % -3));
        System.out.println("-5.0 % 3 \t = " + (-5.0 % 3));
        System.out.println("5.0 % 0 \t = " + (5.0 % 0));

        System.out.println("Percobaan 14: Shift operator");
        int x = 7;
        System.out.println("x = " + x);
        System.out.println("x >> 2 = " + (x >> 2));
        System.out.println("x << 1 = " + (x << 1));
        System.out.println("x >>> 1 = " + (x >>> 1));
    }
}
