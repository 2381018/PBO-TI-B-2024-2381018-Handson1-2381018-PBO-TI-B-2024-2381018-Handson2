package ternaryoperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 75;
        String gradeNilaiPbo = "A";
        String hasil = (gradeNilaiPbo.equals("A")) ? "lulus" : "Tidak Lulus";
        if(nilai >= 75){
            hasil = "lulus";
        } else {
            hasil = "Tidak lulus";
        }
        System.out.println("Hasil Ujian : " +hasil);
    }
}
