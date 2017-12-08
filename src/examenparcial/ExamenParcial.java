/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import java.util.Scanner;

/**
 *
 * @author paris
 */
public class ExamenParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                Telefono telefono = new Telefono();
        Operadores ope=new Operadores();
        String plan;
        Scanner input= new Scanner(System.in);
        System.out.println("Catalogo de Telefonos\n");
        op();
        String marca=input.nextLine();
        telefono.celular(marca);
              
        System.out.println("\nSelccione Operadora:"
                + "\n0: Claro"
                + "\n1: Movistar"
                + "\n2: Entel");
        String operador=input.nextLine();
        switch(operador)
        {
            case "0":
                System.out.println("Selecione Plan"
                        
                + "\n79"
                + "\n129"
                + "\n179");   
                plan=input.nextLine();
                ope.Claro(plan);
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
            case "1":
                System.out.println("Selecione Plan"
                        
                + "\n89"
                + "\n119"
                + "\n189");   
                plan=input.nextLine();
                ope.Movistar(plan);                
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
            case "2":
                System.out.println("Selecione Plan"
                        
                + "\n39"
                + "\n45"
                + "\n60");   
                plan=input.nextLine();
                ope.Entel(plan);
                
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
        }
    }
    public static void op()
    {
        System.out.println("Examen Parcial");
        System.out.println("Marco Antonio C.A.");
        System.out.println("");  
        
        System.out.println("SELECCIONE MODELO DE CELULAR: "
                + "\nS7: SAMSUNG S7"
                + "\nI6: iPhone 6"
                + "\nH8: Huawei P8"
        );
    }
    }
 
class Telefono
{
  public String Nombre="";
  public String Pantalla="";
  public String Procesador="";
  public String Camara="";
    public void celular(String nom)
    { 
    switch(nom)
    {case "S7":
        Nombre="Samsung S7";
        Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        Camara="8MP";
        System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+Camara
                 + "Precio S/ 9"
                );
        break;
     case "I6":
         Nombre="iPhone 6";
         Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        Camara="8MP";
        System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+Camara
                 + "Precio S/ 49"
                );
        break;
     case "H8":
         Nombre="Huawei P8";
         Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        Camara="8MP";
       System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+Camara
                 + "Precio S/ 1"
                );
        break; 
        }
    }
}

class Operadores
{    
    public String plan="";public String Minutos,RPC,Internet,Sms;
    public double precio;
 public void Entel(String planes)
 {
     if(planes.equals("29"))
 {
    plan="Chip 29";
    Minutos="200 Minutos";
    RPC="Ilimitados";
    Internet="1 GB";
    Sms="500 mensajes";
    precio=29;
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("39"))
 {
    plan="Chip 39";
    Minutos="500 sms";
    RPC="Ilimitados";
    Internet="1.5 GB";
    Sms="Ilimitados";
    precio=149;
    
     
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("45"))
 {
    plan="Chip 45";
    Minutos="500 sms";
    RPC="Ilimitados";
    Internet="2 GB";
    Sms="Ilimitados";
    precio=45;
    
     
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
     else {System.out.println("Plan Incorrecto");}  
     
     
 }
 public void Claro(String planes)
 {
 
 if(planes.equals("99"))
 {
    plan="Claro Max 99";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="6 GB";
    Sms="Ilimitados";
    precio=99;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("149"))
 {
    plan="Claro Max 149";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="8 GB";
    Sms="Ilimitados";
    precio=149;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("189"))
 {
    plan="Claro Max 189";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="10 GB";
    Sms="Ilimitados";
    precio=189;
    
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
 else {System.out.println("Plan Incorrecto");}
     
 }
 public void Movistar(String planes)
 {
     
 if(planes.equals("99"))
 {
    plan="Movistar Play 99";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="5 GB";
    Sms="Ilimitados";
    precio=99;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("139"))
 {
    plan="Movistar Play 139";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="8 GB";
    Sms="Ilimitados";
    precio=139;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("199"))
 {
    plan="Movistar Play 199";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="10 GB";
    Sms="Ilimitados";
    precio=199;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+Sms
             + "\nPrecio S/."+precio);
 }
 else {System.out.println("Plan Incorrecto");}      
 }
 }
       
    
    

