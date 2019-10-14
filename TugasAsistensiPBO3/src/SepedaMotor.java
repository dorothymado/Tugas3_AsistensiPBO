/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aureldorothymado
 */
public class SepedaMotor extends Kendaraan {
    private String namaKendaraan;
    private String tipeKendaraan;
    private float bahanBakar;
    
    public void setNamaKendaraan(String namaKendaraan){
        this.namaKendaraan = namaKendaraan;
    }
    
    public String getNamaKendaraan(){
        return namaKendaraan;
    }
    
    public void setTipeKendaraan(String tipeKendaraan){
        this.tipeKendaraan = tipeKendaraan;
    }
    
    public String getTipeKendaraan(){
        return tipeKendaraan;
    }
    
    public void setBahanBakar(float bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public float getBahanBakar(){
        return bahanBakar;
    }
    
    public void infoKendaraan(){
        System.out.println("Nama Kendaraan : " + getNamaKendaraan());
        System.out.println("Tipe Kendaraan : " + getTipeKendaraan());
        super.infoKendaraan();
    }
}
