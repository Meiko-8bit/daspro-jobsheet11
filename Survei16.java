import java.util.Scanner;

public class Survei16 {
    public static void main(String[] args) {
        int Responden = 10;
        int Pertanyaan = 6;
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[Responden][Pertanyaan];

        for (int i = 0; i < Responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < Pertanyaan; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1 sampai 5.");
                    }
                } while (jawaban < 1 || jawaban > 5);
                survei[i][j] = jawaban;
            }
        }

        double totalSemua = 0;

        System.out.println("\n=== Rata-rata setiap responden ===");
        for (int i = 0; i < Responden; i++) {
            double totalResponden = 0;
            for (int j = 0; j < Pertanyaan; j++) {
                totalResponden += survei[i][j];
            }
            totalSemua += totalResponden;
            System.out.printf("Responden %d: %.2f%n", (i + 1), totalResponden / Pertanyaan);
        }

        System.out.println("\n=== Rata-rata setiap pertanyaan ===");
        for (int j = 0; j < Pertanyaan; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < Responden; i++) {
                totalPertanyaan += survei[i][j];
            }
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), totalPertanyaan / Responden);
        }

        System.out.println("\n=== Rata-rata keseluruhan ===");
        System.out.printf("%.2f%n", totalSemua / (Responden * Pertanyaan));

        sc.close();
    }
}