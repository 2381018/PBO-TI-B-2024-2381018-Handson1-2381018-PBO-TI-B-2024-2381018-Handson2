package branching;

import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner input = new scanner(source: system.in);

        System.out.println("Masukkan nomor hari(1 - 7) : ");
        int nomorHari = input.nextInt();

        String namaHari= "";

        if(nomorHari == 1){
            namaHari = "Minggu";
        }else if(nomorHari == 2){
            namaHari =  "Senin";
        }else if(nomorHari == 3){
            namaHari = "Selasa";
        }else if(nomorHari == 4){
            namaHari = "Rabu";
        }else if(nomorHari == 5){
            namaHari = "Kamis";
        }else if(nomorHari == 6){
            namaHari = "Jumat";
        }else if(nomorHari == 7){
            namaHari = "Sabtu";
        }else{
            System.out.println("Masukkan nomor hari diantar 1 - 7");
            system.exit(status:0);
        }
        System.out.println("Hari : " +namaHari);
    }


}
