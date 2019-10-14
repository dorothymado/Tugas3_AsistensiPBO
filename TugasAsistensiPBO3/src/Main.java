
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aureldorothymado
 */
public class Main {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
       
        Kendaraan k1 = new Kendaraan(); 
        Mobil m1 = new Mobil();
        SepedaMotor sp1 = new SepedaMotor();
        
        
       String a;
        System.out.print("Masukkan Jenis : ");
       a = input.nextLine();
       
       
       if("Kendaraan".equals(a)){
       System.out.print("Masukkan ID Kendaraan : ");
       int idKendaraan = input.nextInt();
       System.out.print("Masukkan Jarak Tempuh Awal : ");
       float jarakTempuhAwal = input.nextFloat();
       System.out.print("Masukkan Jarak Tempuh : ");
       float jarakTempuh = input.nextFloat();
       System.out.print("Masukkan Bahan Bakar : ");
       float bahanBakar = input.nextFloat();
        
       
        System.out.println("");
        System.out.println("==============================");
        k1.setId(idKendaraan);
        k1.setJarakTempuhAwal(jarakTempuhAwal);
        k1.setJarakTempuh(jarakTempuh);
        k1.setBahanBakar(bahanBakar);
        k1.infoKendaraan();
       
        
       } 
       else if ("Sepeda Motor".equals(a)){
       System.out.print("Masukkan ID Kendaraan : ");
       int idKendaraan = input.nextInt();
       System.out.print("Masukkan Jarak Tempuh Awal : ");
       float jarakTempuhAwal = input.nextFloat();
       System.out.print("Masukkan Jarak Tempuh : ");
       float jarakTempuh = input.nextFloat();
       System.out.print("Masukkan Bahan Bakar : ");
       float bahanBakar = input.nextFloat();
       System.out.print("Masukkan Nama Kendaraan : ");
       String namaKendaraan = input.next();
       System.out.print("Masukkan Tipe Kendaraan : ");
       String tipeKendaraan = input.next(); 
       
       System.out.println("");
       System.out.println("==============================");
       sp1.setId(idKendaraan);
       sp1.setJarakTempuhAwal(jarakTempuhAwal);
       sp1.setJarakTempuh(jarakTempuh);
       sp1.setBahanBakar(bahanBakar);
       sp1.setNamaKendaraan(namaKendaraan);
       sp1.setTipeKendaraan(tipeKendaraan);
       sp1.infoKendaraan();
   
       
       } 
       else if("Mobil".equals(a)){
       System.out.print("Masukkan ID Kendaraan : ");
       int idKendaraan = input.nextInt();
       System.out.print("Masukkan Jarak Tempuh Awal : ");
       float jarakTempuhAwal = input.nextFloat();
       System.out.print("Masukkan Jarak Tempuh : ");
       float jarakTempuh = input.nextFloat();
       System.out.print("Masukkan Bahan Bakar : ");
       float bahanBakar = input.nextFloat();
       System.out.print("Masukkan Nama Kendaraan : ");
       String namaKendaraan = input.next();
       System.out.print("Masukkan Tipe Kendaraan : ");
       String tipeKendaraan = input.next();
       System.out.print("Masukkan Kapasitas Mesin : ");
       int kapasitasMesin = input.nextInt();
       
      System.out.println("");
      System.out.println("==============================");
       m1.setId(idKendaraan);
       m1.setJarakTempuhAwal(jarakTempuhAwal);
       m1.setJarakTempuh(jarakTempuh);
       m1.setBahanBakar(bahanBakar);
       m1.setNamaKendaraan(namaKendaraan);
       m1.setTipeKendaraan(tipeKendaraan);
       m1.setKapasitasMesin(kapasitasMesin);
       m1.infoKendaraan();
        
 
       }
       
    }
    
}
    
     

