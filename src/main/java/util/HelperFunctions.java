package util.util;

public class HelperFunctions {
    /**
     * Gives leeway in how many pixels something can be off by.
     * @param n The number
     * @param stepSize The amount of pixels it can be off by.
     * @return associated pixel range.
     */
    public static int stepFunction(int n, int stepSize) {
        return (n / stepSize) * stepSize;
    }
}
