package latihan;
import java.util.Scanner;
public class Soal2 {
    
    public class NilaiMaksimumTiga {
        public static void main(String[] args) {
            // Membuat scanner untuk input
            Scanner input = new Scanner(System.in);

            // Meminta pengguna memasukkan tiga bilangan
            System.out.print("1: ");
            int bilangan1 = input.nextInt();

            System.out.print("2: ");
            int bilangan2 = input.nextInt();

            System.out.print("3: ");
            int bilangan3 = input.nextInt();

            // Mencari nilai maksimum menggunakan if
            int maksimum;
            if (bilangan1 > bilangan2 && bilangan1 > bilangan3) {
                maksimum = bilangan1;
            } else if (bilangan2 > bilangan1 && bilangan2 > bilangan3) {
                maksimum = bilangan2;
            } else {
                maksimum = bilangan3;
            }

            // Menampilkan nilai maksimum
            System.out.println("Nilai maksimum dari ketiga bilangan adalah: " + maksimum);
        }
    }

}
