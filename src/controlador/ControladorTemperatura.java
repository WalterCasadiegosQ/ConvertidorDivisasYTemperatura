/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Celsius;
import modelo.Fahrenheit;
import modelo.Kelvin;

/**
 *
 * @author casad
 */
public class ControladorTemperatura {
    
    public float convertir(int pasar, int para, String valor) throws NumberFormatException{
        float valor2 = Float.parseFloat(valor);
        switch(pasar){
            case 0:
                return Celsius.convertir(valor2, para);
            case 1:
                return Kelvin.convertir(valor2, para);
            case 2:
                return Fahrenheit.convertir(valor2, para);
        }
        return 0;
    }
}
