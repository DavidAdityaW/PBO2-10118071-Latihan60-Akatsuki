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
public class PBO210118071Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Akatsuki o;
        o = new Orochimaru();
        o.setNama("Orochimaru");
        System.out.println("Nama Anggota " + o.getNama());
        o.asalDesa();
        o.jutsu();
        
        System.out.println();
        
        Akatsuki p;
        p = new Pain();
        p.setNama("Pain");
        System.out.println("Nama Anggota " + p.getNama());
        p.asalDesa();
        p.jutsu();
        
        System.out.println();
        
        Akatsuki d;
        d = new Deidara();
        d.setNama("Deidara");
        System.out.println("Nama Anggota " + d.getNama());
        d.asalDesa();
        d.jutsu();
    }
}
