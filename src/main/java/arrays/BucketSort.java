package arrays;

public class BucketSort {
    private BucketSort() {
    }

    public static void sort(int[] array,int maxNum) {
        int bucketArr[] = new int[maxNum];

        int index=0;
        for (int i : array) {
          bucketArr[i]++;
        }


        for (int i=0;i<bucketArr.length;i++) {
            if(bucketArr[i]<=0)continue;
            while (bucketArr[i]-- > 0) {
              array[index++]=  i;
            }
        }
    }
}
