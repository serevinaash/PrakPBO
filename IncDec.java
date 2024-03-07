public class IncDec {
    public static void main(String[] args) {
        int a = 1, b = 9;
        System.out.println("Nilai sebelum increment-decrement");
        System.out.println("a=" + a + ": b=" + b);

        a = ++a;
        b = --b;

        System.out.println("Nilai setelah increment-decrement");
        System.out.println("a=" + a + ": b=" + b);
    }
}

class Complement {
    public static void main(String[] args) {
        int i = 7;
        i = ~i;
        System.out.println("Hasil operasi ~ : " + i);
    }
}
