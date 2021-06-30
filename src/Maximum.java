public class Maximum {

    public static void main(String[] args) {
        Integer a = 2, b = 4, c = 6;
        Float x = 3.4f, y = 4.6f, z = 6.7f;
        String l = "apple", m = "banana", n = "orange";

        Maximum.getMaximum(a, b, c);
        Maximum.getMaximum(x, y, z);
        Maximum.getMaximum(l, m, n);

    }

    //uc1
    private static <T extends Comparable> void getMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Max "  + max);
    }
}
