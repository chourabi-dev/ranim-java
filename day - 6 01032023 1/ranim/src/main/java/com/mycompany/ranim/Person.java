/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ranim;

/**
 *
 * @author tchou
 */
public class Person {
    
    private int cin;
    private String fullname;

    public int getCin() {
        return cin;
    }

    public String getFullname() {
        return fullname;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public Person(){
        
    }
    
    
    @Override
    public boolean equals(Object p) {
        
        Person test = (Person)p;
        
       if( this.cin == test.cin ){
           return true;
       }
       
       return false;
    }

    
    
    
   
    
    
}
