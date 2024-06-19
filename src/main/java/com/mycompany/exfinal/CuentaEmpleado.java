
package com.mycompany.exfinal;


public class CuentaEmpleado extends Cuentas implements Capacity{
     double interest=0.5;

    public CuentaEmpleado(String name, int age, String cc, double mount,double interest) {
        super(name, age, cc, mount);
        this.interest=interest;
    }

    public double getInterest() {
        return interest;
    }
    
     @Override
    public double depositar(double moutn,double d) {
        double deposit=moutn+d;
          
        return deposit;
        

    }
     
    @Override
    public double retirar(double moutn) {
      System.out.println("How much do you want to retract?");
        double retract=scan.nextDouble();
        double moutnr=moutn-retract;
             return moutnr;
            }

    @Override
    public void conocerI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
