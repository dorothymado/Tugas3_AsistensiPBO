/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aureldorothymado
 */
public class Mobil extends Kendaraan {
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

 
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }
    
    public void infoKendaraan(){
        System.out.println("Nama Kendaraan : " + getNamaKendaraan());
        System.out.println("Tipe Kendaraan : " + getTipeKendaraan());
        System.out.println("Info Kendaraan : " + getKapasitasMesin());
        super.infoKendaraan();
        
    }
    
}
