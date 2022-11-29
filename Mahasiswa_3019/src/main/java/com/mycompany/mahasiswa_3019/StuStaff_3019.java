/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswa_3019;

/**
 *
 * @author Asus
 */
public class StuStaff_3019 extends Mahasiswa_3019 {
    public int unitKerja_3019;
    public int jamKerja_3019;
    
    public StuStaff_3019 (String nama_3019,String nim_3019,String jurusan_3019,int ipk_3019,int unitKerja_3019,int jamKerja_3019){
        super(nama_3019,nim_3019,jurusan_3019,ipk_3019);
        this.unitKerja_3019 = unitKerja_3019;
        this.jamKerja_3019 = jamKerja_3019;
    }
    public double totalPendapatan(){
        return jamKerja_3019 * 30000;
    }
    public void tampilDataMhs(){
        System.out.println("Unit kerja : " + unitKerja_3019);
        System.out.println("Jam kerja : " + jamKerja_3019);
        
    }
}
    

