public class Maximum {

    public static void main(String[] args) {
        Integer a = 2, b = 4, c = 6;
        Float x = 3.4f, y = 4.6f, z = 6.7f;
        
        findMaximum(a, b, c);
        findMaximum(x, y, z);
    }

    //uc1
    private static void findMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Integer" + max);
    }

    //uc2
    private static void findMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Float" + max);
    }

    public String maxPositionString(String firstStringPosition, String secondStringPosition, String thirdStringPosition) {
        String maxString = firstStringPosition;
        if (secondStringPosition.compareTo(maxString) > 0)
            maxString = secondStringPosition;
        if (thirdStringPosition.compareTo(maxString) > 0)
            maxString = thirdStringPosition;
        return maxString;
    }
}