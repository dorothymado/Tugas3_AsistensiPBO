/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis2;

import java.util.Scanner;

/**
 *
 * @author aureldorothymado
 */
public class PelajarMain {

    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
               
        Pelajar pelajar1 = new Pelajar();
       
        System.out.println("Daftar Pelajar 1");
       pelajar1.setNama("Aurel Dorothy Mado");
       pelajar1.setNip("06111840000073");
       pelajar1.setNilaiUjian1(90);
       pelajar1.setNilaiUjian2(94);
       pelajar1.setNilaiTugas(95);
       
        System.out.println("Nama \t\t: " + pelajar1.getNama());
        System.out.println("NIP \t\t: " + pelajar1.getNip());
        System.out.println("Nilai Ujian 1 \t: " + pelajar1.getNilaiUjian1());
        System.out.println("Nilai Ujian 2 \t: " + pelajar1.getNilaiUjian2());
        System.out.println("Nilai Tugas \t: " + pelajar1.getNilaiTugas());
        System.out.println("Nilai Akhir \t: " +pelajar1.nilaiAkhir());
        pelajar1.isiLulus();
        
        System.out.println("");
        System.out.println("=================================================");
        
        System.out.println("");
        System.out.println("Data Pelajar 2");
        System.out.println("Masukkan Data");
       
        
        System.out.print("Masukkan Nama \t: ");
        String nama = read.nextLine();
        
        System.out.print("Masukkan NIP \t: ");
        String nip = read.nextLine();
        
        System.out.print("Masukkan Nilai Ujian 1 \t: ");
        double nilaiUjian1 = read.nextDouble();
        
        System.out.print("Masukkan Nilai Ujian 2 \t: ");
        double nilaiUjian2 = read.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas \t: ");
        double nilaiTugas = read.nextDouble();
        
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("");
       
        Pelajar pelajar2 = new Pelajar(nama, nip, nilaiUjian1,
                nilaiUjian2, nilaiTugas);
        System.out.println("Cetak Data");
        System.out.println("Nama \t\t: " + pelajar2.getNama());
        System.out.println("NIP \t\t: " + pelajar2.getNip());
        System.out.println("Nilai Ujian 1 \t: " + pelajar2.getNilaiUjian1());
        System.out.println("Nilai Ujian 2 \t: " + pelajar2.getNilaiUjian2());
        System.out.println("Nilai Tugas \t: " + pelajar2.getNilaiTugas());
        System.out.println("Nilai Akhir \t: " +pelajar2.nilaiAkhir());
        pelajar2.isiLulus();
        
    }
    
}
