package Hausaufgabe_1;

public class Aufgabe_3 {

    public int[] summe(int[] a, int[] b) {
        // return die Summe von 2 Zahlen die als Array geschrieben sind
        int[] sum = new int[a.length];
        int carry = 0;

        for (int i = sum.length - 1; i >= 0; i--) {
            sum[i] = (a[i] + b[i] + carry) % 10;
            if (a[i] + b[i] + carry >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) {
            int[] new_sum = new int[sum.length + 1];
            new_sum[0] = 1;
            for (int i = 0; i < sum.length; i++) {
                new_sum[i + 1] = sum[i];
            }
            return new_sum;
        } else {
            return sum;
        }
    }

    public int[] differenz(int[] a, int[] b) {
        // return die Differenz von 2 Zahlen die als Array geschrieben sind
        int[] diff = new int[a.length];
        int carry = 0;

        for (int i = diff.length - 1; i >= 0; i--) {
            if (a[i] - b[i] - carry < 0) {
                diff[i] = (10 + a[i] - b[i] - carry) % 10;
                carry = 1;
            } else {
                diff[i] = (a[i] - b[i] - carry) % 10;
                carry = 0;
            }

        }

        if (carry == 1) {
            int[] diff2 = new int[a.length + 1], diff3 = new int[a.length + 1], diff4;
            diff2[0] = 1;
            for (int i = 0; i < diff.length; i++) {
                diff3[i + 1] = diff[i];
            }
            diff4 = differenz(diff2, diff3);
            diff4[0] = -1;
            return diff4;
        } else {
            return diff;
        }
    }

    public int[] multiplikation(int[] a, int b) {
        // return die Multiplikation von 2 Zahlen die als Array geschrieben sind
        int[] mul = new int[a.length];
        int carry = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            mul[i] = (a[i] * b + carry) % 10;
            if (a[i] * b + carry >= 10) {
                carry = (a[i] * b + carry) / 10;
            } else {
                carry = 0;
            }
        }

        if (carry != 0) {
            int[] new_mul = new int[mul.length + 1];
            new_mul[0] = carry;
            for (int i = 0; i < mul.length; i++) {
                new_mul[i + 1] = mul[i];
            }
            return new_mul;
        } else {
            return mul;
        }
    }

    public int[] division(int[] a, int b) {
        // return die Division von 2 Zahlen die als Array geschrieben sind
        int[] div = new int[a.length];
        int new_size = div.length;
        int i = 0, j = 0;

        if (a[i] / b == 0) {
            new_size--;
        }
        while (i < a.length - 1) {
            if (a[i] / b != 0) {
                div[j] = a[i] / b;
                j++;
                a[i] = a[i] % b;
            } else {
                i++;
                a[i] = a[i - 1] * 10 + a[i];
            }

        }

        if (new_size != div.length) {
            int[] new_div = new int[div.length - 1];
            for (i = 0; i < new_div.length; i++) {
                new_div[i] = div[i];
            }
            return new_div;
        } else {
            return div;
        }
    }
}