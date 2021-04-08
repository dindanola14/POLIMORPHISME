/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STORE;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String [] args){
        
        //membuat objek player
        TOKO electric = new TOKO();
        //membuat atribut player
        electric.display();
        System.out.println("====================================================");
        electric.setAdmin("Dinda Nola Dimelda");
        System.out.println("Admin         : "+electric.getAdmin());
        System.out.println("====================================================");
        
        //membuat objek player
        SmartPhone hp = new SmartPhone();
        //membuat atribut player
        System.out.println("SmartPhone");
        hp.setHarga(2500000);
        hp.setTotal(2);
        hp.setMerk("Samsung");
        hp.setjmlKamera(2);
        System.out.println("Harga         : "+hp.getHarga());
        System.out.println("Total         : "+hp.getTotal());
        System.out.println("Merk          : "+hp.getMerk());
        System.out.println("Jumlah Kamera : "+hp.getjmlKamera());
        hp.display();
        System.out.println("Total Belanja : "+(hp.getHarga()*hp.getTotal()));
        System.out.println("====================================================");
        
        //membuat objek player
        TV listrik = new TV();
        //membuat atribut player
        System.out.println("TV");
        listrik.setHarga(1000000);
        listrik.setTotal(1);
        listrik.setMerk("Toshiba");
        listrik.setJenis("Tabung");
        System.out.println("Harga         : "+listrik.getHarga());
        System.out.println("Total         : "+listrik.getTotal());
        System.out.println("Merk          : "+listrik.getMerk());
        System.out.println("Jenis         : "+listrik.getJenis());
        listrik.display();
        System.out.println("Total Belanja : "+(listrik.getHarga()*listrik.getTotal()));
        System.out.println("====================================================");
        
        //membuat objek player
        KipasAngin kotak = new KipasAngin();
        //membuat atribut player
        System.out.println("Kipas Angin");
        kotak.setHarga(700000);
        kotak.setTotal(3);
        kotak.setMerk("Maspion");
        kotak.setUkuran(12);
        System.out.println("Harga         : "+kotak.getHarga());
        System.out.println("Total         : "+kotak.getTotal());
        System.out.println("Merk          : "+kotak.getMerk());
        System.out.println("Ukuran        : "+kotak.getUkuran()+" inch");
        kotak.display();
        System.out.println("Total Belanja : "+(kotak.getHarga()*kotak.getTotal()));
        System.out.println("====================================================");
    }
}
