/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author MUHAMMAD CANDRA
 */
public class A {

   

    String fName, lName, stuID, stuStatus;

    public A (String fName, String lName, String stuID, String stuStatus) {
        
           this.fName = fName;
           this.lName = lName;
           this.stuID = stuID;
           this.stuStatus = stuStatus;
        }
    public String getfNmae (){
        return fName;
    }
    public void setfName (){
        this.lName = lName;
    }
    public String getlNmae (){
        return lName;
    }
    public void setlName (){
        this.lName = lName;
    }
    public String getstuID (){
        return stuID;
    }
    public void setstuID (){
        this.stuID = stuID;
    }
    public String getstuStatus (){
        return stuStatus;
    }
    public void setstuStatus (){
        this.stuStatus = stuStatus;
    }
    public static void main(String[] args){
        A student =  new A ("Lisa", "Palambo", "123456789", "Active");
        System.out.println("Nama Siswa:" + student.fName + student.lName);
        System.out.println("ID Siswa:" + student.stuID );
        System.out.println("Status Siswa:" + student.stuStatus );
    }
    }
