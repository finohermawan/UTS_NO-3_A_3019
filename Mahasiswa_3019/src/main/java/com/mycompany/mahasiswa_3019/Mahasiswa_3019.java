/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mahasiswa_3019;

/**
 *
 * @author Asus
 */
public class Mahasiswa_3019 {
     protected String nim_3019;
    protected String nama_3019;
    protected String jurusan_3019;
    protected int ipk_3019;
    
    public Mahasiswa_3019(String nim_3019,String nama_3019,String jurusan_3019,int ipk_3019){
        this.nama_3019 = nama_3019;
        this.nim_3019 = nim_3019;
        this.jurusan_3019 = jurusan_3019;
        this.ipk_3019 = ipk_3019;
    }
    public void tampilDataMhs() {
        System.out.println("Nama : " + nama_3019);
        System.out.println("NIM : " + nim_3019);
        System.out.println("Jurusan : " + jurusan_3019);
        System.out.println("IPK : " + ipk_3019);
    }
}


    
