/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        objetoparqueadero parqueadero= new objetoparqueadero(75,20,10,12,8,6); 
        
        String tipo;
        
        System.out.println("ingrese el tipo de vehiculo(carro,moto,bicicleta): ");
        tipo =entrada.nextLine();
        
        if("carro".equals(tipo))
        {
            ArrayList<vehiculo> listacarros=  new ArrayList<vehiculo>();
        }
        if("moto".equals(tipo))
        {
            ArrayList<vehiculo> listamotos=  new ArrayList<vehiculo>();
        }
        if("bicicleta".equals(tipo))
        {
            ArrayList<vehiculo> listabicicletas=  new ArrayList<vehiculo>();
        }
        
        
       
        
        
        
    }
    
}
