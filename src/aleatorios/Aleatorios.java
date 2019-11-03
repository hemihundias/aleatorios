/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import java.util.ArrayList;

/**
 *
 * @author David Pardo Calvo
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numLista = new ArrayList<>();
        
        for(int i=0;i<40;i++){
            numLista.add((int)Math.floor(Math.random()*101));
        }              
                               
        for(int i = 0;i<numLista.size();i++){
            System.out.println(numLista.get(i));  
        }                       
                                
    }
    
}
