/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author casad
 */
public class Celsius {
    
    static public float convertir(float celsius, int para){
        if(para==1){
            return celsius + (float)273.15;
        }else if(para == 2){
            return (celsius * ((float)9/5))+32;
        }
        return celsius;
    }
}
