/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD CANDRA
 */
public class Cobacoba {

int harga1, harga2, harga3, harga4;
    public Cobacoba (int harga1, int harga2, int harga3, int harga4)  {
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.harga3 = harga3;
        this.harga4 = harga4;
    }
    public int getharga1(){
        return harga1;
    }
    public void setharga1(){
        this.harga1 = harga1;
    }
    public int getharga2(){
        return harga2;
    }
    public void setharga2(){
        this.harga2 = harga2;
    }
    public int getharga3(){
        return harga3;
    }
    public void setharga3(){
        this.harga3 = harga3;
    }
    public int getharga4(){
        return harga4;
    }
    public void setharga4(){
        this.harga4 = harga4;
    }
    public static void main(String[] args){
        
    System.out.println("---------------------------------------");
    System.out.println("Kharisma Agung Plaza (KAP)");
    System.out.println("Promo Belanja Berhadiah");
    System.out.println("Khusus Pembelian 5 Barang Pertama");
    System.out.println("Dengan Harga MInimum Rp10000,00");
    
    Cobacoba price = new Cobacoba (1000, 4000, 2000, 6000);
    System.out.println("masukan harga1 : " + price.harga1);
    System.out.println("masukan harga2 : " + price.harga2);
    System.out.println("masukan harga3 : " + price.harga3);
    System.out.println("masukan harga4 : " + price.harga4);
    System.out.println("Total Harga Belanja Muhammad Candra Alifisya : " + (price.harga1 + price.harga2 + price.harga3 + price.harga4));
    System.out.println("");
    
    if((price.harga1 + price.harga2 + price.harga3 + price.harga4)>= 10000){
        System.out.println("Selamat Anda Mendapatkan 1 Buah Mug Cantik");
    }else {
        System.out.println("");
    }
    System.out.println("");
    System.out.println("---------------------------------------");
    System.out.println("Terima Kasih");
    System.out.println("Anda Telah Berbelanja di Kharisma Agung Plaza");
   }
}