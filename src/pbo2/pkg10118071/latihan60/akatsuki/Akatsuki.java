/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     profil anggota akatsuki
 * 
 */
public class Akatsuki {
    private String nama;
    
    public void asalDesa() {
        System.out.println("Asal Desa Anggota Akatsuki");
    }
    
    public void jutsu() {
        System.out.println("Jutsu Anggota Akatsuki");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
