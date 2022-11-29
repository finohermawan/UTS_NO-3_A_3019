/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswa_3019;

/**
 *
 * @author Asus
 */
public class AsisPrak_3019 extends Mahasiswa_3019   {
    public String mkAsistensi_3019;
    public int jmlPertemuan_3019;
    
    public AsisPrak_3019(String nama_3019,String nim_3019,String jurusan_3019,int ipk_3019,String mkAsistensi_3019,int jmlPertemuan_3019){
        super(nama_3019,nim_3019,jurusan_3019,ipk_3019);
        this.mkAsistensi_3019 = mkAsistensi_3019;
        this.jmlPertemuan_3019 = jmlPertemuan_3019;
    }
    public double totalPendapatan(){
        return jmlPertemuan_3019 * 50000;
    }
    public void tampilDataMhs(){
        System.out.println("Mata kuliah : " +mkAsistensi_3019);
        System.out.println("Jumlah pertemuan : " + jmlPertemuan_3019);
    }
}
    

