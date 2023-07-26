/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.*;
/**
 *
 * @author casad
 */
public class Controlador {
    
    public Controlador(int opcion){
        switch(opcion){
            case 1:
                VistaMoneda vista1 = new VistaMoneda();
                vista1.setVisible(true);
                break;
            case 2:
                VistaTemperatura vista2 = new VistaTemperatura();
                vista2.setVisible(true);
                break;
            default:
                VistaPrincipal vista3 = new VistaPrincipal();
                vista3.setVisible(true);
                break;
        }
    }
}
