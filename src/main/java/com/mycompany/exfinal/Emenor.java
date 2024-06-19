
package com.mycompany.exfinal;

public class Emenor {
    public static void verificar(int age) throws Exception {
        if (age<=14) {
            throw new Exception("Welcome to the program ahorro juvenil");
        }
    }  
    public static void verificarM(double moutn) throws Exception {
        if (moutn<=0) {
            throw new Exception("The initial amount must be greater than 0");
        }
    } 
    public static void verificartype(String type) throws Exception {
        if (type.equalsIgnoreCase("empleado")) {
            throw new Exception("The initial amount must be greater than 0");
        }
    } 
   
}
