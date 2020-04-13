/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class objetoparqueadero 
{
    float precioparqueaderocarros;
    float precioparqueaderomotos;
    float precioparqueaderobicicletas;
    int maximacapacidadcarro=9;
    int maximacapacidadmotos;
    int maximacapacidadbicicletas;
 
 objetoparqueadero(float par1,float par2,float par3, int par4, int par5 , int par6)
 {
    this.precioparqueaderocarros= par1;
    this.precioparqueaderomotos= par2;
    this.precioparqueaderobicicletas= par3;
    this.maximacapacidadcarro= par4;
    this.maximacapacidadmotos= par5;
    this.maximacapacidadbicicletas= par6;
 }
 

    objetoparqueadero() {
     
    }
     
 public  int contador()
 {
     if ("Carro".equals(vehiculo.tipovehiculo)) {
         maximacapacidadcarro--;
         
        
     }
     
     return maximacapacidadcarro;
     
 }

 static     ArrayList<Integer> tarifa=  new ArrayList<Integer>();
  public void tarifa(String tipo)
    {
        
        switch (tipo) {
            case "Carro":
                tarifa.add(75);
                // System.out.println("tarifa "+ tarifa);
                break;
            case "Moto":
                tarifa.add(20);
                // System.out.println("tarifa "+ tarifa);
                break;
            case "Bicicleta":
                tarifa.add(10);
                //System.out.println("tarifa "+ tarifa);
                break;
            default:
                break;
        }
        
        
    }
 
}
