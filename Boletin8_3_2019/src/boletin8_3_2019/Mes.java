/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Mes {

   
    private int num_mes;

    boolean a = true;

    public Mes() {

    

    }

    public void resultado() {

        while (a == true) {

            this.num_mes = Integer.parseInt(JOptionPane.showInputDialog("Elige mes :\n 1. 1= ENERO.\n 2= FEBRERO.\n 3= MARZO.\n 4= ABRIL.\n 5= MAYO.\n 6= JINIO.\n 7= JULIO.\n 8= AGOSTO.\n 9= SEPTIEMBRE.\n 10= OCTUBRE.\n 11= NOVIEMBRE.\n 12= DICIEMBRE."));

            switch (num_mes) {

                case 1:

                    System.out.println("El mes tiene 31 dias. ");

                    a = false;

                    break;

                case 2:

                    System.out.println("El mes tiene 28 dias. ");
                    a = false;
                    break;

                case 3:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;

                case 4:

                    System.out.println("El mes tiene 30 dias. ");
                    a = false;
                    break;
                case 5:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;
                case 6:

                    System.out.println("El mes tiene 30 dias. ");
                    a = false;
                    break;
                case 7:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;
                case 8:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;
                case 9:

                    System.out.println("El mes tiene 30 dias. ");
                    a = false;
                    break;
                case 10:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;
                case 11:

                    System.out.println("El mes tiene 30 dias. ");
                    a = false;
                    break;
                case 12:

                    System.out.println("El mes tiene 31 dias. ");
                    a = false;
                    break;

            }
            
           if (a==true){
            
            JOptionPane.showMessageDialog(null,"El numero es incorrecto, vuelva a intentarlo"); 

        }
        
            
        }
       
    }

}
