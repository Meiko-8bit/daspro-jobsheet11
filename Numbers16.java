import java.util.Arrays;

public class Numbers16 {
    public static void main(String[] args) {
        // Langkah 2: array jagged
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        System.out.println(Arrays.toString(myNumbers));
        System.out.println(Arrays.deepToString(myNumbers));

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);

        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);

        int[][] a = { { 1, 2 }, { 3, 4 } };
        int[][] b = a.clone();
        b[0][0] = 99;
        System.out.println(a[0][0]);

        int[][] c = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            c[i] = Arrays.copyOf(a[i], a[i].length);
        }
        c[1][0] = 77;
        System.out.println(a[1][0] + " " + c[1][0]);
    }
}
