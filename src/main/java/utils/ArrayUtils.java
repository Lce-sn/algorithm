package utils;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int[] getEmptyArrays(int len) {
        return new int[len];
    }

    public static int[] getRandomArrays(int len, int range) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }

}
