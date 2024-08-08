/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;

/**
 *
 * @author joseg
 */
import java.util.HashMap;

public class DataContainer {
    public HashMap<String, String> datos;

    // Constructor
    public DataContainer() {
        datos = new HashMap<>();
    }

    // Setter para agregar datos al HashMap
    public void setDatos(String clave, String valor) {
        datos.put(clave, valor);
    }

    // Getter para obtener el HashMap completo
    public HashMap<String, String> getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        return  "" + datos;
    }
    
    
}