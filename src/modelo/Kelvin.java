/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author casad
 */
public class Kelvin {
    
    static public float convertir(float kelvin, int para){
        if(para==0){
            return kelvin-(float)273.15;
        }else if(para==2){
            return ((kelvin-(float)273.15)*((float)9/5))+32;
        }
        return kelvin;
    }
}
