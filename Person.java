/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsoal;

/**
 *
 * @author MUHAMMAD CANDRA
 */
class Person {
    String Name;
    int Age;
    
    public Person(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public void setName(){
        this.Name = Name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(){
        this.Age = Age;
    }
}