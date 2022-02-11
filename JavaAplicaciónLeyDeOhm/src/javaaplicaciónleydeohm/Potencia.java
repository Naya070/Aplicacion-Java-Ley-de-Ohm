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
public class Potencia {
      double Volt, Amp;
      double Res;
      public double Pot;
      
    public Potencia (){
       
    }
    
  public void CálculoPotencia(double V, double I){
       
        Volt = V;
        Amp = I;
        Pot = (Volt*Amp);
      

  }
   public void CálculoPotencia(double I, float R){
       
        Amp = I;
        Res = R;
       Pot = ((Amp*Amp)*Res);
       

  }
    public void CálculoPotencia(float R, double V){
       
       Res = R;
       Volt = V;
       
       
       Pot = ((Volt*Volt)/Res);
       

  }   
}
