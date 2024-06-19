
package com.mycompany.exfinal;

import java.util.Scanner;

class Cuentas implements Capacity{
         Scanner scan=new Scanner(System.in);
    String name;
    int age;
    String typeAc;
    double mount;

    public Cuentas(String name, int age, String cc, double mount) {
        this.name = name;
        this.age = age;
        this.typeAc = cc;
        this.mount = mount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCc() {
        return typeAc;
    }

    public void setCc(String cc) {
        this.typeAc = cc;
    }

    public double getMount() {
        return mount;
    }

    public void setMount(double mount) {
        this.mount = mount;
    }

    @Override
    public double depositar(double moutn, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double retirar(double moutn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void conocerI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

   

    

    
    
    
}
