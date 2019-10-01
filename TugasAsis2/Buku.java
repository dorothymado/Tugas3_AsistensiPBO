/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis2;

/**
 *
 * @author aureldorothymado
 */
public class Buku {
    private String namaPengarang, judulBuku;
    private int tahunTerbit, cetakanKe;
    private double hargaJual;
    
    
    public Buku(){
        this.namaPengarang = "nama pengarang";
        this.judulBuku = "judul buku";
        this.tahunTerbit = 0;
        this.cetakanKe = 0;
        this.hargaJual = 0;
    }

    public Buku(String namaPengarang, String judulBuku, 
            int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
      
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public double getHargaJual() {
        return hargaJual;
    }
    
    public void info(){
        System.out.println("Nama Pengarang \t: " + getNamaPengarang());
        System.out.println("Judul Buku \t: " + getJudulBuku());
        System.out.println("Tahun Terbit \t: " + getTahunTerbit());
        System.out.println("Cetakan Buku \t: " + getCetakanKe());
        System.out.println("Harga Buku \t: " + getHargaJual());
    }
    
}
