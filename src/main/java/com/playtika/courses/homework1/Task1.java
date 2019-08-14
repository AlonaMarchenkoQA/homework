package com.playtika.courses.homework1;


public class Task1 {

    public static void main(String[] args) {
        double x = 1L;
        double y = 2L;
        double z = 3L;
        double n = 4L;


        long equation1Result = equation1(x, y, z, n);
        int equation2Result = equation2(x, y, z, n);
        float equation3Result = equation3(x, y, z, n);
        double equation4Result = equation4(x, y, z, n);

        System.out.println(equation1Result);
        System.out.println(equation2Result);
        System.out.println(equation3Result);
        System.out.println(equation4Result);
    }

    private static long equation1(double x, double y, double z, double n) {
        return (long) (x - (y + 123) / z * n);
    }

    private static int equation2(double x, double y, double z, double n) {

        return (int) ((x + (50 - y * z) / n) - x);
    }

    private static float equation3(double x, double y, double z, double n) {
        return (float) (x / (y * (z - 1) - 564) + n);
    }

    private static double equation4(double x, double y, double z, double n) {
        return -x / -y + z / (n + 15);
    }
}
