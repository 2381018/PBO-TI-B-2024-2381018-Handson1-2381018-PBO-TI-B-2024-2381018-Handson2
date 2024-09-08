package latihan;

public class Soal1 {
    import java.util.Scanner;

    public class NilaiMaksimum {
        public static void main(String[] args) {
            // Membuat scanner untuk input
            Scanner input = new Scanner(System.in);

            // Meminta pengguna memasukkan dua bilangan
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = input.nextInt();

            // Mencari nilai maksimum menggunakan if
            int maksimum;
            if (bilangan1 > bilangan2) {
                maksimum = bilangan1;
            } else {
                maksimum = bilangan2;
            }

            // Menampilkan nilai maksimum
            System.out.println("Nilai maksimum dari kedua bilangan adalah: " + maksimum);
        }
    }

}
