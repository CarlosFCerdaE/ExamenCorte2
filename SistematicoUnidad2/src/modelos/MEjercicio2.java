/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gabriel Chang
 */
public class MEjercicio2 {

   public void ordenarAL(ArrayList<Integer> edades) {
       Collections.sort(edades);
   }
    
    public double encontrarPromedio(ArrayList<Integer> edades) {
        double suma = 0, prom;
        
        for(int i = 0; i < edades.size(); i++) {
            suma += edades.get(i);
        }
        
        prom = suma/(edades.size());
        
        return prom;
    }
    
}
