/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119901latihan21programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menghitung Rata - Rata Nilai
 *
 */

public class PBO10K10119901Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa;
        double nilaiMahasiswa, rataRata;
        double total_nilai = 0;

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        
        jumlahMahasiswa = scanner.nextInt();
        
        for (int i = 1; i <= jumlahMahasiswa; i++) 
        {
            System.out.printf("Nilai Mahasiswa ke-%1$d : ", i);
            
            nilaiMahasiswa  = scanner.nextDouble();
            total_nilai     += nilaiMahasiswa;
        }

        rataRata = total_nilai / jumlahMahasiswa;
        
        System.out.println("\nMaka, rata-rata nilainya adalah : " + rataRata);
    }
    
}
