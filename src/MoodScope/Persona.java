/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;

/**
 *
 * @author wzyx_
 */
public abstract class Persona {
    //ATRIBUTOS
    public String nombre;
    public enum TituloPersonal{
           Ninguno, Sr, Sra, Srita,Otro,
        }

    
    //METODOS
    public abstract void setNombre(String nombre);
    public abstract String getNombre();
}
