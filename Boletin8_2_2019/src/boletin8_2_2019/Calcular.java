package boletin8_2_2019;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drodriguezguardiola
 */
public class Calcular {
    
   double unidad,precio;

    public Calcular() {
    }
   
   
   
   

    public Calcular(int unidad, int precio) {
        this.unidad = unidad;
        this.precio = precio;
    }
    
    
    public void calcular_precio(){
        
        precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce precio unitario del producto"));
        unidad=Double.parseDouble(JOptionPane.showInputDialog("Introduce unidades del producto"));
        double preciofinal;
        double descuento;
        if(unidad<100){
            
            preciofinal=precio*unidad;
            descuento=0;
            System.out.println("El precio es= "+ precio +"\nLa unidades = "+unidad+ "\nDescuento = "+descuento+"\nEl precio total a pagar = "+preciofinal );
            
        }else if(unidad>=100 && unidad<=200){
            
            if(precio>4000){
                
                descuento=0.05;
                preciofinal=(precio-(precio*descuento))*unidad;
                
                 System.out.println("El precio es= "+ precio +"\nLa unidades = "+unidad+ "\nDescuento = "+descuento+"%\nEl precio total a pagar = "+preciofinal );
            
                     
                
            }else {
                
               descuento=0.02;
                preciofinal=(precio-(precio*descuento))*unidad;
                
                 System.out.println("El precio es= "+ precio +"\nLa unidades = "+unidad+ "\nDescuento = "+descuento+"%\nEl precio total a pagar = "+preciofinal );
            
                     
            }
            
        }else {
            
            if(precio>4000){
                
               descuento=0.10;
                preciofinal=(precio-(precio*descuento))*unidad;
                
                 System.out.println("El precio es= "+ precio +"\nLa unidades = "+unidad+ "\nDescuento = "+descuento+"%\nEl precio total a pagar = "+preciofinal );
            
                     
                
                
            }else{
                
                descuento=0.08;
                preciofinal=(precio-(precio*descuento))*unidad;
                
                 System.out.println("El precio es= "+ precio +"\nLa unidades = "+unidad+ "\nDescuento = "+descuento+"%\nEl precio total a pagar = "+preciofinal );
            
                     
                
            }
            
        }
        
        
    }
    
    
    
    
}
