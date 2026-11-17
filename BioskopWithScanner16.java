import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Baris atau kolom tidak valid. Silakan coba lagi.");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        continue;
                    }
                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();

                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi);
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih.");
                jalan = false;
            } else {
                System.out.println("Menu tidak tersedia.");
            }
        }
        sc.close();
    }
}