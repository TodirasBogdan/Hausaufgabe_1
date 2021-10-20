package Hausaufgabe_1;

/**
 * Die Universität hat die folgenden Regeln für die Benotung:
 *  ● Jeder Student bekommt eine Note zwischen 0 und 100.
 *  ● Eine Note weniger als 40 ist eine nicht ausreichende Note.
 * Der Professor rundet die Note mit den folgenden Regeln ab:
 *  ● Wenn die Differenz zwischen der Note und dem nächsten Vielfachen (Multipel) von
 * 5 weniger als 3 ist, dann wird die Note zu dem nächsten Vielfachen (Multipel) von 5
 * aufgerundet.
 *  ● Wenn die Note weniger als 38 ist, wird die Note nicht aufgerundet.
 * z.B. 84 → 85
 * 29 → 29
 */

public class Aufgabe_1 {

    /**
     * Eine Methode, die ein Array von Noten bekommen soll. Als der
     * Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
     * @param notes ist ein Array von Noten
     * @return new_notes_2 = ein Array von Noten < 38 von notes
     */
    public int[] nichtAusreichendeNoten(int[] notes) {
        int[] newNotes = new int[notes.length];
        int j = 0;

        for (int note : notes) {
            if (note < 38) {
                newNotes[j] = note;
                j++;
            }
        }

        int[] newNotes2 = new int[j];
        System.arraycopy(newNotes, 0, newNotes2, 0, newNotes2.length);

        return newNotes2;
    }

    /**
     * Eine Methode, die ein Array von Noten bekommen soll. Als der
     * Rückgabewert soll die Methode den Durchschnittswert liefern.
     * @param notes ist ein Array von ungerundete Noten
     * @return den Durchschnittswert der ungerundeten Noten
     */
    public int durchschnitt(int[] notes) {
        int sum = 0;

        for (int note : notes) {
            sum += note;
        }

        return sum / notes.length;
    }

    /**
     * Eine Methode, die ein Array von Noten bekommen soll. Als der
     * Rückgabewert soll die Methode ein Array mit dem abgerundete Noten liefern.
     * @param notes ist ein Array von ungerundete Noten
     * @return newNotes = ein Array von abgerundete Noten
     */
    public int[] abgerundeteNoten(int[] notes) {
        int[] newNotes = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 38 && (3 <= notes[i] % 10 && notes[i] % 10 <= 4)) {
                newNotes[i] = notes[i] + (5 - (notes[i] % 10));
            } else if (notes[i] >= 38 && 8 <= notes[i] % 10) {
                newNotes[i] = notes[i] + (10 - (notes[i] % 10));
            } else{
                newNotes[i] = notes[i];
            }
        }

        return newNotes;
    }

    /**
     * Eine Methode, die ein Array von Noten bekommen soll. Als der
     * Rückgabewert soll die Methode die maximale abgerundete Note liefern.
     * @param notes ist ein Array von ungerundete Noten
     * @return max = die maximale abgerundete Note
     */
    public int maxAbgerundeteNote(int[] notes) {
        int[] newNotes = abgerundeteNoten(notes);
        int max = newNotes[0];

        for (int i = 1; i < newNotes.length; i++) {
            if (newNotes[i] > max) {
                max = newNotes[i];
            }
        }

        return max;
    }

}
