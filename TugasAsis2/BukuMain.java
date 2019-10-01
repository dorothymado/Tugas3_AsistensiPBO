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
public class BukuMain {

    public static void main(String[] args) {
         Scanner read = new Scanner (System.in) ;
         
        System.out.println("Input Data");
        System.out.println("");
         
        System.out.print("Masukkan Nama Pengarang : ");
        String namaPengarang = read.nextLine();
        
        System.out.print("Masukkan Judul Buku \t: ");
        String judulBuku = read.nextLine();
        
        System.out.print("Masukkan Tahun Terbit \t: ");
        int tahunTerbit = read.nextInt();
        
        System.out.print("Masukkan Cetakan Buku \t: ");
        int cetakanKe = read.nextInt();
        
        System.out.print("Masukkan Harga Buku \t: ");
        double hargaBuku = read.nextDouble();
        
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("");
        
        System.out.println("Output Data");
        Buku buku1 = new Buku(namaPengarang, judulBuku, 
                tahunTerbit, cetakanKe, hargaBuku );
        buku1.info();
    
    }
    
}
