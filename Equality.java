public class Equality {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Equality operators:");
        System.out.println("=============== ");
        System.out.println("Equals: 5 == 5.0 \t\t " + (x == f0));
        System.out.println("Not Equal: 5 != 5.0 \t " + (x != f0));
        System.out.println("Equals: arr1 == arr2 \t " + (arr1 == arr2) + " [different array objects]");
        System.out.println("Equals: arr1 == arr3 \t " + (arr1 == arr3) + " [ref to same array object]");
        System.out.println("Not Equal: arr1 != arr2 \t " + (arr1 != arr2));
        System.out.println("Not Equal: arr1 != arr3 \t " + (arr1 != arr3));
        System.out.println("Equals: s1 == s2 \t\t " + (s1 == s2) + " [same literal]");
        System.out.println("Equals: s1 == s3 \t\t " + (s1 == s3) + " [same object reference]");
        System.out.println("Equals: s1 == s4 \t\t " + (s1 == s4) + " [s4 is a new object]");

    }
}
