/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Calculo {

    double cantidad;

    public Calculo() {
        
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce nunero"));
    }

    public void operacion() {

        double cantidad_final;
        double incremento;

        if (cantidad >=0 && cantidad< 500) {

            incremento = cantidad * 0.5;
            cantidad_final = cantidad + incremento;

            System.out.println("Cantidad = " + cantidad + "\nIncremento = " + incremento + "\nCantidad Final = " + cantidad_final);

        } else if (cantidad >= 500 && cantidad < 1000) {
            incremento = cantidad * 0.07;
            cantidad_final = cantidad + incremento;
            System.out.println("Cantidad = " + cantidad + "\nIncremento = " + incremento + "\nCantidad Final = " + cantidad_final);

        } else if (cantidad >= 1000 && cantidad < 5000) {
            incremento = cantidad * 0.15;
            cantidad_final = cantidad + incremento;
            System.out.println("Cantidad = " + cantidad + "\nIncremento = " + incremento + "\nCantidad Final = " + cantidad_final);
        } else if (cantidad > 5000) {
            incremento = cantidad * 0.03;
            cantidad_final = cantidad + incremento;
            System.out.println("Cantidad = " + cantidad + "\nIncremento = " + incremento + "\nCantidad Final = " + cantidad_final);
        } else {
            System.out.println("El numero es negativo");
        }

    }

}
