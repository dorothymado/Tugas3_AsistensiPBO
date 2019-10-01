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
public class Pelajar {
   private String nama, nip;
   private double nilaiUjian1, nilaiUjian2, nilaiTugas;
    
   public Pelajar(){
   this.nama = "nama";
   this.nip = "nip";
   this.nilaiUjian1 = 0;
   this.nilaiUjian2 = 0;
   this.nilaiTugas = 0;
   }

    public Pelajar(String nama, String nip, 
            double nilaiUjian1, double nilaiUjian2, double nilaiTugas) {
        this.nama = nama;
        this.nip = nip;
        this.nilaiUjian1 = nilaiUjian1;
        this.nilaiUjian2 = nilaiUjian2;
        this.nilaiTugas = nilaiTugas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNilaiUjian1(double nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public void setNilaiUjian2(double nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }
    
    public double nilaiAkhir(){
        double nilaiAkhir;
        nilaiAkhir = (0.4 * getNilaiUjian1()) 
            + (0.4 * getNilaiUjian1()) + (0.2 * getNilaiTugas());
    return nilaiAkhir;
    }
   
    public void isiLulus(){
        System.out.print("Kelulusan \t: ");
        if (nilaiAkhir() >= 70){
            System.out.println("Lulus");
        }
        else
            System.out.println("Tidak Lulus");
    }
}
