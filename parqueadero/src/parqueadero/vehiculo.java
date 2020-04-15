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
 
 static ArrayList<String> tiempoingreso =new ArrayList<String>();
 static ArrayList<String> tiemposalida =new ArrayList<String>();
 public static String tipovehiculo;
 public boolean vehiculoenparqueadero;

vehiculo(String tipovehiculo,String tiempoingreso,String tiemposalida,Boolean vehiculoenparqueadero)
{
    this.tipovehiculo= tipovehiculo;
    this.vehiculoenparqueadero= vehiculoenparqueadero;
    //this.tiempoingreso
    //this.tiemposalida =new ArrayList<Integer>();
    
}

    vehiculo() {
      
    }
    
    
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
        
}int hora_entrada=0;
public int entrada(String hora,String min)
{
    tiempoingreso.add(hora+":"+min);
   
   
 hora_entrada=((Integer.parseInt(hora)*60)+Integer.parseInt(min));
    System.out.println("hora: "+hora_entrada );
    return hora_entrada;
}
int hora_salida=0;
public int salida(String hora,String min)
{
    tiemposalida.add(hora+":"+min);
   
   
 hora_salida=((Integer.parseInt(hora)*60)+Integer.parseInt(min));
    System.out.println("hora: "+hora_salida );
    return hora_salida;
}
public void calculo()
{
    System.out.println("total:" +(hora_entrada-hora_salida));
}
int indice;
public int buscar(String buscar)
{
   
   
     indice=placa.indexOf(buscar);
       
        if (indice>=0) {
            System.out.println("se encuentra en "+indice+"eeee"+listaVehiculos.get(indice)+"fff"+placa.get(indice));
           // vehiculoenparqueadero=true;
            
            return indice;
        } 
        else{
            //vehiculoenparqueadero=false;
            indice=-1;
         return indice;  
        }
           
           
       
}

}
