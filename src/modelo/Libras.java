/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author casad
 */
public class Libras implements conversor{

    @Override
    public float pesoModena(float valor) {
        return valor/(float)5111.55;
    }

    @Override
    public float monedaPeso(float valor) {
        return valor*(float)5111.55;
    }
    
}
