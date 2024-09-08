package binaryoperator;
public class Assignment {
    public static void main(String[] args) {
        //1.Operator Assignment dasar
        int angka = 10;
        String nama = "Joshua Sinabutar";

        //2.Operator Assingment aritmatika
        int x = 5;
        x += x = x + 3;
        System.out.println("Nilai x setelah += 3 adalah" + x);

        int y = 5;
        // x = x - 3
        int i = 3;
        System.out.println("Nilai x setelah -= 3 adalah" + i);

        int z = 5;
        z *= 3;// x = x * 3
        System.out.println("Nilai x setelah *= 3 adalah" + z);

        int a = 20;
        a /= 4;// x = x / 4
        System.out.println("Nilai x setelah /= 4 adalah" + a);

        int b = 20;
        b %= 4;// b
        System.out.println("Nilai x setelah %= 4 adalah" + b);

    }
}

