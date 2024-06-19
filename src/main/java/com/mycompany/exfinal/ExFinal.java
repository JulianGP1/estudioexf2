
package com.mycompany.exfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExFinal {

    public static void main(String[] args)throws Exception{
         List<Cuentas> Cuenta=new ArrayList<>();
         Scanner scan=new Scanner(System.in);
         Intereses interes=new Intereses();
         while (true) {            
                         Cuentas cuenta;

             Cuentas cuenta1=new Cuentas("",0,"",0);
             System.out.println("Do you want to open an account? yes/no");

             String r=scan.nextLine();
             if (r.equalsIgnoreCase("no")) {
                 break;
             }
             System.out.println("type of account");
             String type=scan.nextLine();
             //tipo empleado
             try {
                 Emenor.verificartype(type);
             } catch (Exception t) {
              cuenta = new CuentaEmpleado("", 0, "", 0, 0.05); 

                 System.out.println("ingresa tu nombre xfa");
                 String naame=scan.nextLine();
                 cuenta.setName(naame);
                 System.out.println("egrees u age");
                 int age=scan.nextInt();
            try  {
                 Emenor.verificar(age);
                 
             } catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             System.out.println("Amount to start");
             double moutn=scan.nextDouble();
             try {
                 Emenor.verificarM(moutn);
             } catch (Exception ex) {
                 System.out.println("ERROR"+" "+ex.getMessage());
                 break;
             }             
             moutn=moutn+interes.interes(moutn);
             System.out.println("Congratulations Account Created!!");
             System.out.println("Do you want to deposit,see interest ,retit or a credit?");
             scan.nextLine();
             String res=scan.nextLine();
             if (res.equalsIgnoreCase("deposit")) {
                 System.out.println("cuanto?");
                 double d=scan.nextDouble();
                    cuenta.depositar(moutn, d);
                     System.out.println("tu cuenta tiene "+ cuenta.depositar(moutn,d));
                     break;
                        
                 }else if(res.equalsIgnoreCase("interest")){
             }else{break;}
             }
            //////
             System.out.println("egrees u name");
             String name=scan.nextLine();
             cuenta1.setName(name);
             System.out.println("egrees u age");
             int age=scan.nextInt();
             try  {
                 Emenor.verificar(age);
                 
             } catch (Exception e) {
                 System.out.println(e.getMessage());
             }
             System.out.println("Amount to start");
             double moutn=scan.nextDouble();
             try {
                 Emenor.verificarM(moutn);
             } catch (Exception ex) {
                 System.out.println("ERROR"+" "+ex.getMessage());
                 break;
             }
            // System.out.println("the interest on your amount:");
             moutn=moutn+interes.interes(moutn);
             System.out.println("you moutn is:"+moutn);
             System.out.println("Congratulations Account Created!!");
             Cuenta.add(cuenta1);
        }
  
    
    }
}
