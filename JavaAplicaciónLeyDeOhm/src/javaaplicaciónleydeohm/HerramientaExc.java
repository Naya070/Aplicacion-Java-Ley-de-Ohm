/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplicaciónleydeohm;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class HerramientaExc {
   
    public static boolean VValidar(double I, float P){
     if(I ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
      
}
    
    public static boolean AvrValidar(double V, double R){
     
     
     if(R==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
    }
      
      public static boolean AvpValidar(double V, float P){
     
     
      if(V ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
      
}
      
      public static boolean AprValidar(float P, double R){
     
     
      if(R ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
}
      
      
       public static boolean RviValidar(double V, double I){
     
     
     if(I ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
     
}
       
       public static boolean RvpValidar(double V, float P){
     
     
      if(P ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
     
}
    
       
       public static boolean RpiValidar(float P, double I){
     
     
     if(I ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
     
}
       
     public static boolean PrvValidar(float R, double V){
     
     
     if(R ==0){
      JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");   
        return false;
        } else  
    return true;
     
}
       
       
      
}
    

