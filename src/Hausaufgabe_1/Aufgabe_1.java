package Hausaufgabe_1;

public class Aufgabe_1 {

    /**
     *
     * @param notes
     * @return die Noten < 38
     */
    public int[] nicht_ausreichende_noten(int[] notes) {
        int[] new_notes = new int[notes.length];
        int j = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 38) {
                new_notes[j] = notes[i];
                j++;
            }
        }

        int[] new_notes_2 = new int[j];
        for (int i = 0; i < new_notes_2.length; i++)
            new_notes_2[i] = new_notes[i];

        return new_notes_2;
    }

    /**
     *
     * @param notes
     * @return die Durchschnittswert der unabgerundeten Noten
     */
    public int durchschnittswert(int[] notes) {
        int sum = 0;

        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }

        return sum / notes.length;
    }

    /**
     *
     * @param notes
     * @return nur die abgerundete Noten
     */
    public int[] abgerundete_noten(int[] notes) {
        int[] new_notes = new int[notes.length];
        int length_2 = 0;

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 38 && (3 <= notes[i] % 10 && notes[i] % 10 <= 4)) {
                new_notes[length_2] = notes[i] + (5 - (notes[i] % 10));
                length_2++;
            } else if (notes[i] >= 38 && (8 <= notes[i] % 10 && notes[i] % 10 <= 9)) {
                new_notes[length_2] = notes[i] + (10 - (notes[i] % 10));
                length_2++;
            }
        }

        int[] new_notes_2 = new int[length_2];
        for (int i = 0; i < new_notes_2.length; i++)
            new_notes_2[i] = new_notes[i];

        return new_notes_2;
    }

    /**
     *
     * @param notes
     * @return die maximale abgerundete Note
     */
    public int max_abgerundete_note(int[] notes) {
        int[] new_notes = abgerundete_noten(notes);
        int max = new_notes[0];

        for (int i = 1; i < new_notes.length; i++) {
            if (new_notes[i] > max) {
                max = new_notes[i];
            }
        }

        return max;
    }


}
