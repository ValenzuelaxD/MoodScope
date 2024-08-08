/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba1fechas;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import static javax.swing.JOptionPane.*;


/**
 *
 * @author wzyx_
 */
public class Fechas {
    
    enum Dias{
            LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }
        
        public enum TituloPersonal{
            Sr, Sra, Srita
        }
        
        ArrayList<LocalDate> date= new ArrayList<LocalDate>();
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        String salida = hoy.toString();
        System.out.println(hoy);
        ArrayList<LocalDate> fechas = new ArrayList<LocalDate>();
        // Agregar una fecha al ArrayList
        fechas.add(hoy);
    }    
        
        
        //date.add(LocalDate.parse(showInputDialog("Ingrese la fecha que desea agregar:" + Dias.values())));
        //date.
    
} 

