package Hausaufgabe_1;

public class Aufgabe_4 {

    public int billigste_tastatur(int[] arr) {
        // return die minimale Zahl aus einem Array
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public int teuersten_gegenstand(int[] a, int[] b) {
        // return die maximale Zahl aus 2 Arrays
        int max1 = a[0], max2 = b[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
            }
        }
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max2) {
                max2 = b[i];
            }
        }

        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
    }

    public int teuerste_USB_unten_budget(int[] arr, int budget) {
        // return die maximale Zahl aus einem Array < budget
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] <= budget) {
                max = arr[i];
            }
        }

        return max;

    }

    public int maximal_geldbetrag(int a[], int b[], int budget) {
        // return die maximale Summe von 2 Elementen aus 2 Arrays < budget
        int max = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] > max && a[i] + b[j] <= budget) {
                    max = a[i] + b[j];
                }
            }
        }

        return max;
    }


}
