package Hausaufgabe_1;

public class Aufgabe_2 {

    /**
     *
     * @param arr
     * @return die maximale Zahl aus einem Array
     */
    public int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     *
     * @param arr
     * @return die minimale Zahl aus einem Array
     */
    public int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     *
     * @param arr
     * @return die Summe aus einem Array - die minimale Zahl
     */
    public int max_sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int max_sum = sum - min(arr);

        return max_sum;
    }

    /**
     *
     * @param arr
     * @return die Summe aus einem Array - die maximale Zahl
     */
    public int min_sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int min_sum = sum - max(arr);

        return min_sum;
    }

}
