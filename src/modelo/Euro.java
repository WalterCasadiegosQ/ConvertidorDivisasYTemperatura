/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author casad
 */
public class Euro implements conversor{

    @Override
    public float pesoModena(float valor) {
        return valor/(float)4425.21;
    }

    @Override
    public float monedaPeso(float valor) {
        return valor*(float)4425.21;
    }
    
}
