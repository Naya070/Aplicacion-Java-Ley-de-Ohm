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
public class Amperaje {
 double Volt, Res;
 double Pot;
 public double Amp;
    
    public Amperaje (){
       
    }
    
  public void CálculoAmperaje(double V, double R){
       
        
        if(HerramientaExc.AvrValidar(V, R)){
            Volt = V;
            Res = R;
            Amp = (Volt/Res);
        }

  }
   public void CálculoAmperaje(double V, float P){
       
        
        if(HerramientaExc.AvpValidar(V, P)){
            Volt = V;
            Pot = (double) P;    
            Amp = (Pot/Volt);
        
        }
       

  }
    public void CálculoAmperaje(float P, double R){
       
       
       if(HerramientaExc.AprValidar(P, R)){
            Pot = (double) P;
            Res = R;   
            Amp = Math.sqrt((Pot/Res));
       }
       

  }    
}
