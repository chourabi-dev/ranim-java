/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ranim;

/**
 *
 * @author tchou
 */
public class Employee {
    
    private String name;
    private String dep;

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Employee(String name, String dep) {
        this.name = name;
        this.dep = dep;
    }

    @Override
    public String toString() {
        return this.name.concat(" ").concat(this.dep);
    }
    
    
    
    
    
    
}
