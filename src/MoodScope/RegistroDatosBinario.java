/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author joseg
 */
public class RegistroDatosBinario {
    private static List<Double> respuestasAlimentacion = new ArrayList<>();

    public static void agregarRespuesta(double respuesta) {
        respuestasAlimentacion.add(respuesta);
    }
    
    public static void escribirRespuestasEnArchivoBinario(String pregunta) {
        // Crear el contenido a escribir en el archivo binario
        List<Object> contenido = new ArrayList<>();
        contenido.add(pregunta);
        contenido.addAll(respuestasAlimentacion);

        // Intentar escribir el contenido en el archivo binario "registro.bin"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("registro.bin", true))) {
            oos.writeObject(contenido);
        } catch (IOException e) {
            System.err.println("Error al guardar las respuestas en el archivo binario: " + e.getMessage());
        }

        // Limpiar la lista de respuestas después de escribirlas en el archivo
        respuestasAlimentacion.clear();
    }

}
