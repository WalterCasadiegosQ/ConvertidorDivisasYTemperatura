/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;

/**
 *
 * @author casad
 */
public class ControladorMoneda {
    int opcion;
    float valor;
    
    
    public ControladorMoneda(){
        
    }
    
    public ControladorMoneda(int opcion, String valor) throws NumberFormatException{
        this.opcion=opcion;
        this.valor = Float.parseFloat(valor);
    }
    
    public float convertir(){
        switch(this.opcion){
            case 0:
                conversor con = new Dolar();
                return con.pesoModena(valor);
            case 1:
                conversor con1 = new Euro();
                return con1.pesoModena(valor);
            case 2:
                conversor con2 = new Libras();
                return con2.pesoModena(valor);
            case 3:
                conversor con3 = new Yen();
                return con3.pesoModena(valor);
            case 4:
                conversor con4 = new Won();
                return con4.pesoModena(valor);
            case 5:
                conversor con5 = new Dolar();
                return con5.monedaPeso(valor);
            case 6:
                conversor con6 = new Euro();
                return con6.monedaPeso(valor);
            case 7:
                conversor con7 = new Libras();
                return con7.monedaPeso(valor);
            case 8:
                conversor con8 = new Yen();
                return con8.monedaPeso(valor);
            case 9:
                conversor con9 = new Won();
                return con9.monedaPeso(valor);
        }
        return 0;
    }
    
}
