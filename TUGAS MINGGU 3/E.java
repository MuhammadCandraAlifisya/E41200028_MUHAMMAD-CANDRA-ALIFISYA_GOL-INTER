/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emenu;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD CANDRA
 */
public class Emenu {
    String menu1, menu2, menu3, menu4;
    
    public Emenu (String menu1, String menu2, String menu3, String menu4){
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.menu4 = menu4;
    }
    public String getmenu1(){
        return menu1;
    }
    public void setmenu1(){
        this.menu1 = menu1;
    }
    public String getmenu2(){
        return menu2;
    }
    public void setmenu2(){
        this.menu2 = menu2;
    }
    public String getmenu3(){
        return menu3;
    }
    public void setmenu3(){
        this.menu3 = menu3;
    }
    public String getmenu4(){
        return menu4;
    }
    public void setmenu4(){
        this.menu4 = menu4;
    }
public static void main(String[] args){
    System.out.println("CAFE CERIA");
    System.out.println("ANEKA MINUMAN");
    System.out.println("------------------");
    System.out.println("");
    System.out.println("MENU SPESIAL :");
   
    
    Emenu daftar = new Emenu ("es teh", "es doger", "es kelapa muda", "es dawet");
        System.out.println("1. " + daftar.menu1);
        System.out.println("1. " + daftar.menu2);
        System.out.println("1. " + daftar.menu3);
        System.out.println("1. " + daftar.menu4);
        

    String menu;
    Scanner scan = new Scanner(System.in);
    System.out.print("MASUKAN MENU ANDA: ");
    menu = scan.nextLine();
        switch (menu){
            case "es teh":
            System.out.println("AKAN KAMI PROSES SEGERA");
            break;
            case "es doger":
            System.out.println("AKAN KAMI PROSES SEGERA");
            break;
            case "es kelapa muda":
            System.out.println("AKAN KAMI PROSES SEGERA");
            break;
            case "es dawet":
            System.out.println("AKAN KAMI PROSES SEGERA");           
            break;            
        }
        System.out.println("TERIMA KASIH TELAH BERKUNJUNG");
}
}
    
    
    

