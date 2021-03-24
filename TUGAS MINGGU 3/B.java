/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.array;


import java.util.Arrays;
import java.util.Scanner;


public class BARRAY {

    public static void main(String[] args) {
                
        int[] angka = new int[5];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < angka.length; i++){
            System.out.print("Masukan Angka ke-"+i+" : ");
            angka[i] = scan.nextInt();
        }
        
        System.out.println("Isi Array Angka : "+Arrays.toString(angka));
    }
    
}
