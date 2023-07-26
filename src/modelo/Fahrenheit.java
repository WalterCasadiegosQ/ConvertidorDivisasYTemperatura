/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author casad
 */
public class Fahrenheit {
    
    static public float convertir(float fahrenheit, int para){
        if(para==0){
            return (fahrenheit-32)* ((float)5/9);
        }else if(para==1){
            return ((fahrenheit-32)* ((float)5/9)) + (float)273.15;
        }
        return fahrenheit;
    }
}
