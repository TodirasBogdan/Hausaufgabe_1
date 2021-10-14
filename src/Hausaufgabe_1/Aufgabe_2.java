package Hausaufgabe_1;

public class Aufgabe_2 {

    public int max(int[] arr) {
        // return die maximale Zahl aus einem Array
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public int min(int[] arr) {
        // return die minimale Zahl aus einem Array
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public int max_sum(int[] arr) {
        // return die Summe aus einem Array - die minimale Zahl
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int max_sum = sum - min(arr);

        return max_sum;
    }

    public int min_sum(int[] arr) {
        // return die Summe aus einem Array - die maximale Zahl
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int min_sum = sum - max(arr);

        return min_sum;
    }

}
