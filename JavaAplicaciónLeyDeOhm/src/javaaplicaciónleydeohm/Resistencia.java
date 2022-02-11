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
public class Resistencia {
    double Volt, Amp;
    double Pot;
    public double Res;
    
    public Resistencia (){
       
    }
    
  public void CálculoResistencia(double V, double I){
       
        Volt = V;
        Amp = I;
        if(HerramientaExc.RviValidar(V, I)){
        Res = (Volt/Amp);
        }
      

  }
   public void CálculoResistencia(double V, float P){
       
        Volt = V;
        Pot = (double) P;
        if(HerramientaExc.RvpValidar(V, P)){
       Res = ((Volt*Volt)/Pot);
        }
       

  }
    public void CálculoResistencia(float P, double I){
       
       Pot = (double)P;
       Amp = I;
       Res = (Pot/(Amp*Amp));
       

  }    
}
