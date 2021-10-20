package Hausaufgabe_1;

public class Main {

    public static void main(String[] args) {

        // Aufgabe 1
        System.out.println("Aufgabe 1:");
        int[] notes = {92, 27, 38, 45, 67, 74, 89, 33};
        Aufgabe_1 A1 = new Aufgabe_1();

        // Aufgabe 1.1
        int[] nichtAusreichendeNoten = A1.nichtAusreichendeNoten(notes);
        for (int j : nichtAusreichendeNoten) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 1.2
        System.out.println(A1.durchschnitt(notes));

        // Aufgabe 1.3
        int[] abgerundeteNoten = A1.abgerundeteNoten(notes);
        for (int j : abgerundeteNoten) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 1.4
        System.out.println(A1.maxAbgerundeteNote(notes));


        // Aufgabe 2
        System.out.println();
        System.out.println("Aufgabe 2:");
        int[] array = {4, 8, 3, 10, 17};
        Aufgabe_2 A2 = new Aufgabe_2();

        // Aufgabe 2.1
        System.out.println(A2.max(array));

        // Aufgabe 2.2
        System.out.println(A2.min(array));

        // Aufgabe 2.3
        System.out.println(A2.maxSum(array));

        // Aufgabe 2.4
        System.out.println(A2.minSum(array));


        // Aufgabe 3
        System.out.println();
        System.out.println("Aufgabe 3:");
        int[] z1 = {2, 4, 0, 0, 0, 0, 0, 0, 0}, z2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        Aufgabe_3 A3 = new Aufgabe_3();

        // Aufgabe 3.1
        int[] summe = A3.summe(z1, z2);
        for (int j : summe) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 3.2
        int[] differenz = A3.differenz(z1, z2);
        for (int j : differenz) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 3.3
        int[] multiplikation = A3.multiplikation(z1, 4);
        for (int j : multiplikation) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 3.4
        int[] division = A3.division(z1, 4);
        for (int j : division) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 4
        System.out.println();
        System.out.println("Aufgabe 4:");
        int[] tastaturen = {15, 20, 10, 35}, usbLaufwerke = {20, 45, 40, 25};
        int budget = 30;
        Aufgabe_4 A4 = new Aufgabe_4();

        // Aufgabe 4.1
        System.out.println(A4.billigsteTastatur(tastaturen));

        // Aufgabe 4.2
        System.out.println(A4.teuerstenGegenstand(tastaturen, usbLaufwerke));

        // Aufgabe 4.3
        System.out.println(A4.teuersteUsbUntenBudget(usbLaufwerke, budget));

        // Aufgabe 4.4
        System.out.println(A4.maximalGeldbetrag(tastaturen, usbLaufwerke, budget));


    }
}
