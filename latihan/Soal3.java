package latihan;
import java.util.Scanner;

public class Soal3 {

    public class KalkulatorSederhana {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();


            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();


            System.out.print("Pilih operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);


            double hasil = 0;


            switch(operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':

                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        return;
                    }
                    break;
                case '%':

                    if (angka2 != 0) {
                        hasil = angka1 % angka2;
                    } else {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid.");
                    return;
            }


            System.out.println("Hasil: " + hasil);


            input.close();
        }
    }

}
