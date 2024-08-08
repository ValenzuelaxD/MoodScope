/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodScope;

/**
 *
 * @author Jorge_Silva
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class RegistroDatos {
    private static ArrayList<Double> respuestasAlimentacion = new ArrayList<>();

    public static void guardarRespuesta(double respuesta) {
        
        respuestasAlimentacion.add(respuesta);
    }

    public static void escribirRespuestasEnArchivo(String pregunta) {
        // Crear el contenido a escribir en el archivo
        StringBuilder contenido = new StringBuilder();
        contenido.append(pregunta).append(":\n");
        for (Double respuesta : respuestasAlimentacion) {
            contenido.append(respuesta).append("\n");
        }

        // Intentar escribir el contenido en el archivo "registro.txt"
        try (PrintWriter writer = new PrintWriter(new FileWriter("registro.txt", true))) {
            writer.println(contenido.toString());
        } catch (IOException e) {
            System.err.println("Error al guardar las respuestas: " + e.getMessage());
        }

        // Limpiar la lista de respuestas después de escribirlas en el archivo
        respuestasAlimentacion.clear();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public static void escribirRespuestasEnArchivo(String pregunta) {
    StringBuilder contenido = new StringBuilder();
    contenido.append(pregunta).append(":\n");
    for (Double respuesta : respuestasAlimentacion) {
        contenido.append(respuesta).append("\n");
    }

    try (
            
            PrintWriter writer = new PrintWriter(new FileWriter("registro.txt", true))) 
    
    
    
    {
        writer.println(contenido.toString());
    } catch (IOException e) {
        System.err.println("Error al guardar las respuestas: " + e.getMessage());
    }

    // Limpiar la lista de respuestas después de escribirlas en el archivo
    respuestasAlimentacion.clear();
}*/

}


