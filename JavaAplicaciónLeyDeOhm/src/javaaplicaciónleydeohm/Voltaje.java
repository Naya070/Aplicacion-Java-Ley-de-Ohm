/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplicaciónleydeohm;



/**
 *
 * @author Usuario
 */
public class Voltaje extends JavaAplicaciónLeyDeOhm {
    
    double Amp, Res;
    double Pot;
    
    public double Volt;
    
    public Voltaje (){
       
    }
    
  public void CálculoVoltaje(double I, double R){
       
        Amp = I;
        Res = R;
       Volt = (Res*Amp);
      
  }
   public void CálculoVoltaje(double I, float P){
       
       
        if (HerramientaExc.VValidar(I, P)){
        
        Amp =  I;
        Pot = (double) P;        
       Volt = (Pot/Amp);
                
        }

  }
    public void CálculoVoltaje(float P, double R){
       
       Pot = (double) P;
       Res = R;
       Volt = Math.sqrt((Pot*Res));
      

  }
  }  

