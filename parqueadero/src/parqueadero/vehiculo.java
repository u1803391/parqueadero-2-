/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author crist
 */
public class vehiculo 
{
 
 ArrayList<Date> tiempoingreso;
 ArrayList<Date> tiemposalida;
 public String tipovehiculo;
 public boolean vehiculoenparqueadero;

vehiculo(String tipovehiculo,Date tiempoingreso,Date tiemposalida,Boolean vehiculoenparqueadero)
{
    this.tipovehiculo= tipovehiculo;
    this.vehiculoenparqueadero= vehiculoenparqueadero;
    this.tiempoingreso =new ArrayList<Date>();
    this.tiemposalida =new ArrayList<Date>();
    
}
    
}
