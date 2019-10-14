/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aureldorothymado
 */
public class Kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    float bahanBakar;

    
    public void setId(int idKendaraan){
        this.idKendaraan = idKendaraan;
    }
    public int getId(){
       return idKendaraan;
    }
    public void setJarakTempuhAwal(float jarakTempuhAwal){
        this.jarakTempuhAwal = jarakTempuhAwal;
    }
    public float getJarakTempuhAwal(){
        return jarakTempuhAwal;
    }
     public void setJarakTempuh(float jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    public float getJarakTempuh(){
        return jarakTempuh;
    }
    
    public void setBahanBakar(float bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    public float getBahanBakar(){
        return bahanBakar;
    }
    
    public float totalJarak(){
       float totalJarak;
        totalJarak = jarakTempuhAwal + jarakTempuh;
       return totalJarak;
    }
    public float efektivitas(){
        float E;
          float  x = getJarakTempuh();
          float  y = getBahanBakar();
          y = (float) Math.floor(y);
        E =  (float) Math.exp(x/y) * (float) Math.log10(2);
        return E;
    }
    // cara bikin efektivitasnya gmn ?
    public void efektif(){
        System.out.print("Efektivitas Kendaraan : " );
        if( efektivitas() > 0 && efektivitas() <= 0.5){
            System.out.println("Mesin Efektif");
        } else {
            System.out.println("Mesin tidak efektif");
        }
        System.out.println("" + efektivitas());
    }
    
    public void infoKendaraan(){
        System.out.println("ID Kendaraan \t: " + getId());
        System.out.println("Jarak Awal \t: " + jarakTempuhAwal);
        System.out.println("Jarak Tempuh \t: " + jarakTempuh);
        System.out.println("Total Jarak \t: " + totalJarak());
        System.out.println("Bahan Bakar \t: " + getBahanBakar());
        efektif();
    }
}
