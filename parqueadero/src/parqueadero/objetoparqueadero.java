/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author crist
 */
public class objetoparqueadero 
{
    float precioparqueaderocarros;
    float precioparqueaderomotos;
    float precioparqueaderobicicletas;
    int maximacapacidadcarro;
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
}
