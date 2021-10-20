package Hausaufgabe_1;

/**
 * Es gibt ein Array mit n positive Zahlen.
 */

public class Aufgabe_2 {

    /**
     * Findet die maximale Zahl aus der Array arr.
     * @param arr ist ein Array mit n positive Zahlen.
     * @return die maximale Zahl aus arr
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
     * Findet die minimale Zahl aus de Array arr.
     * @param arr ist ein Array
     * @return die minimale Zahl aus arr
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
     * Findet die maximale Summe von n-1 Zahlen aus der Array arr.
     * @param arr ist ein Array mit n positive Zahlen.
     * @return die Summe aus einem Array - die minimale Zahl
     */
    public int maxSum(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }

        return sum - min(arr);
    }

    /**
     * Findet die minimale Summe von n-1 Zahlen aus der Array arr.
     * @param arr mit n positive Zahlen.
     * @return die Summe aus einem Array - die maximale Zahl
     */
    public int minSum(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }

        return sum - max(arr);
    }

}
