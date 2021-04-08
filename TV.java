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
//class anak
public class TV extends TOKO{
    //deklarasi variabel
    String Jenis;
    
    //method setter
    public void setHarga(float Harga){
        super.Harga = Harga; // super adalah objek yang mewakili class induk
    }
    
    //method setter
    public void setTotal(int Total){
        super.Total = Total; // super adalah objek yang mewakili class induk
    }
    
    //method setter
    public void setMerk(String Merk){
        super.Merk = Merk; // super adalah objek yang mewakili class induk
    }
    
    //method setter
    public void setJenis(String Jenis){
        this.Jenis = Jenis; // this adalah objek yang mewakili class itu sendiri
    }
    
    //method getter
    public float getHarga(){
        return Harga; // return untuk mengembalikan sebuah nilai
    }
    
    //method getter
    public int getTotal(){
        return Total; // return untuk mengembalikan sebuah nilai
    }
    
    //method getter
    public String getMerk(){
        return Merk; // return untuk mengembalikan sebuah nilai
    }
    
    //method getter
    public String getJenis(){
        return Jenis; // return untuk mengembalikan sebuah nilai
    }
    
    //method display
    public void display(){
    }
}
