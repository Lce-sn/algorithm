import arrays.BubbleSort;
import arrays.BucketSort;
import org.junit.Test;
import utils.ArrayUtils;

import java.util.Arrays;

public class Test01 {
    @Test
    public void testBucket() {
        int[] randomArrays = ArrayUtils.getRandomArrays(20, 50);

        System.out.println(Arrays.toString(randomArrays));
        BucketSort.sort(randomArrays, 50);
        System.out.println(Arrays.toString(randomArrays));
    }

    @Test
    public void testBubble() {
        int[] array = ArrayUtils.getRandomArrays(15, 100);

        System.out.println(Arrays.toString(array));
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
