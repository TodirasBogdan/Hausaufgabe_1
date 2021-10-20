package Hausaufgabe_1;

/**
 * Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat
 * verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise.
 */

public class Aufgabe_4 {

    /**
     * Eine Methode, welche die billigste Tastatur zurückgibt.
     * @param tastaturen ist ein Array von Tastaturpreise
     * @return die minimale Zahl aus einem Array
     */
    public int billigsteTastatur(int[] tastaturen) {
        int min = tastaturen[0];

        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < min) {
                min = tastaturen[i];
            }
        }

        return min;
    }

    /**
     * Eine Methode, welche den teuersten Gegenstand zurückgibt.
     * @param tastaturen ist ein Array von Tastaturpreise
     * @param usb ist ein Array von Usbpreise
     * @return die maximale Zahl aus 2 Arrays
     */
    public int teuerstenGegenstand(int[] tastaturen, int[] usb) {
        int max1 = tastaturen[0], max2 = usb[0];

        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] > max1) {
                max1 = tastaturen[i];
            }
        }
        for (int i = 1; i < usb.length; i++) {
            if (usb[i] > max2) {
                max2 = usb[i];
            }
        }

        return Math.max(max1, max2);
    }

    /**
     * Eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen kann, zurückgibt.
     * @param usb ist ein Array von Usbpreise
     * @param budget ist das Budget von Markus
     * @return die maximale Zahl aus dem Array usb ≤ budget
     */
    public int teuersteUsbUntenBudget(int[] usb, int budget) {
        int max = -1;

        for (int j : usb) {
            if (j > max && j <= budget) {
                max = j;
            }
        }

        return max;

    }

    /**
     * Findet, anhand Markus’ Budget und der Preislisten für die Tastaturen und
     * USB-Laufwerke, den maximalen Geldbetrag, der von Markus ausgegeben wird. Wenn
     * er nicht genug für beide hat, gibt stattdessen -1 zurück. Er kauft nur die zwei
     * benötigten Gegenstände.
     * @param tastaturen ist ein Array von Tastaturpreise
     * @param usb ist ein Array von Usbpreise
     * @param budget ist das Budget von Markus
     * @return die maximale Summe von 2 Elementen aus die 2 Arrays <= budget
     */
    public int maximalGeldbetrag(int[] tastaturen, int[] usb, int budget) {
        int max = -1;

        for (int k : tastaturen) {
            for (int i : usb) {
                if (k + i > max && k + i <= budget) {
                    max = k + i;
                }
            }
        }

        return max;
    }


}
