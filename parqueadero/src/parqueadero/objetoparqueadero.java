/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class objetoparqueadero 
{
    float precioparqueaderocarros;
    float precioparqueaderomotos;
    float precioparqueaderobicicletas;
    static int maximacapacidadcarro=2;
    static int maximacapacidadmotos=8;
    static int maximacapacidadbicicletas=6;
 
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
     
 public  void contador(String tipo)
 {
     int posicion=(vehiculo.listaVehiculos.size()-1);
     switch (tipo) {
            case "Carro":
                maximacapacidadcarro--;
                if (maximacapacidadcarro==0)
                {
                    JOptionPane.showMessageDialog(null, "Cupo LLeno, Carros");
                } else if (maximacapacidadcarro<0) {
           
                
                vehiculo.listaVehiculos.remove(posicion);
                vehiculo.placa.remove(posicion);
                tarifa.remove(posicion);
                maximacapacidadcarro++;
                JOptionPane.showMessageDialog(null, "Cupo LLeno, Bicicletas");
                }
                break;
            case "Moto":
                maximacapacidadmotos--;
                 if (maximacapacidadmotos==0)
                {
                    JOptionPane.showMessageDialog(null, "Cupo LLeno, Motos");
                } 
                break;
            case "Bicicleta":
                maximacapacidadbicicletas--;
                break;
            default:
                break;
        }
    
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
 
  public void salida(int indice)
  {
      String tipo= vehiculo.listaVehiculos.get(indice);
      switch (tipo) {
            case "Carro":
                maximacapacidadcarro++;
                break;
            case "Moto":
                maximacapacidadmotos++;
                break;
            case "Bicicleta":
                maximacapacidadbicicletas++;
                break;
            default:
                break;
        }
      vehiculo.listaVehiculos.remove(indice);
      vehiculo.placa.remove(indice);
      tarifa.remove(indice);
  }
}
