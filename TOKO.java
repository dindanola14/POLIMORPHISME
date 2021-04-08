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
//class induk
public class TOKO{
    //deklarasi variabel
    private String Admin;
    float Harga;
    int Total;
    String Merk;
    
    //method display
    public void display(){
        System.out.println("====================================================");
        System.out.println("Data Barang Yang Di Entry : ");
    }
    
    //method setter
    public void setAdmin(String Admin){
        this.Admin = Admin; // this adalah objek yang mewakili class itu sendiri
    }
    
    //method getter
    public String getAdmin(){
        return Admin; // return untuk mengembalikan sebuah nilai
    }
}
