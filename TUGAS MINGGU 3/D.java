/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.tugas.minggu.dua;

import java.util.Scanner;



/**
 *
 * @author MUHAMMAD CANDRA
 */
public class DTUGASMINGGUDUA {

    public static void main(String[] args){
    int[] array = {0, 2000, 3000, 6000, 2000};   
    String nama;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("TOKO CANDRA");
    System.out.println("PROMO BELANJA AKHIR TAHUN");
    System.out.println("KHUSUS PEMBELIAN MINIMUM BELANJA RP10000,00");
    System.out.println("-------------------------------------------");
    System.out.print("KEPADA YANG TERHORMAT :");
    nama = scan.nextLine();
    
    System.out.println("");
    for(int i=1; i<array.length; i++){
        System.out.println("HARGA BARANG KE-" +i +" ANDA ADALAH :"+ array[i]);
    }
    System.out.println("-------------------------------------------");
    int sum = 0;
    for(int num : array){
        sum = sum+num;
    }
    System.out.println("TOTAL HARGA BELANJAAN ANDA ADALAH :" + sum);
    if(sum >= 10000){
        System.out.println("SELAMAT ANDA MENDAPATKAN 1 BUAH MUG CANTIK");
    }else{
        System.out.println("");
            }
    System.out.println("TERIMAKASIH TELAH BERBELANJA DI TOKO CANDRA");
    }
    
}
