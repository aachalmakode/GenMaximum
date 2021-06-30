package com.generic;
public class Maximum {

    public static void main(String[] args) {
        Integer a = 2, b = 4, c = 6;
        Float x = 3.4f, y = 4.6f, z = 6.7f;
        String l = "apple", m = "banana", n = "orange";
        findMaximum(x, y, z);

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
    }
