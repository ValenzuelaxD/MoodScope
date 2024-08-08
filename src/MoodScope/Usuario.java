/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;

/**
 *
 * @author wzyx_
 */
public class Usuario extends Persona{
   
    private String nombre;
    
    public Usuario() {
        
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
