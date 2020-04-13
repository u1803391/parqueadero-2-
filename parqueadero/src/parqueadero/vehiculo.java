/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class vehiculo
{
 
 ArrayList<Date> tiempoingreso;
 ArrayList<Date> tiemposalida;
 public static String tipovehiculo;
 public boolean vehiculoenparqueadero;

vehiculo(String tipovehiculo,Date tiempoingreso,Date tiemposalida,Boolean vehiculoenparqueadero)
{
    this.tipovehiculo= tipovehiculo;
    this.vehiculoenparqueadero= vehiculoenparqueadero;
    this.tiempoingreso =new ArrayList<Date>();
    this.tiemposalida =new ArrayList<Date>();
    
}

    vehiculo() {
      
    }
    //String nplaca,ntipo;
    
static ArrayList<String> listaVehiculos=  new ArrayList<String>();
 static     ArrayList<String> placa=  new ArrayList<String>();

   
public String vehiculo(String tipovehiculo, String nplaca)
{
  // tipo_vehiculo =jComboBoxTIPO.getSelectedItem().toString();
     
        switch (tipovehiculo) {
          
            case "Carro":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
                
              
                 break;
            case "Moto":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
                break;
            case "Bicicleta":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
               break;
            default:
                break;
        } 
        return tipovehiculo;
        
}
public void ff()
{
    for (int i = 0; i < placa.size(); i++) {
          
           // tabla.addRow(new Object[]{tipo.get(i),placa.get(i)});
           System.out.println(listaVehiculos.get(i)+placa.get(i));
        }
}

int indice;
public int buscar(String buscar)
{
    
   
     indice=placa.indexOf(buscar);
       
        if (indice!=-1) {
            System.out.println("se encuentra en "+indice+"eeee"+listaVehiculos.get(indice)+"fff"+placa.get(indice));
            
        }
        return indice;
}

}
