/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author joseg
 */
public class HashMapBinWritter {
    public static void guardarHashMapEnArchivoBinario(HashMap<String, String> hashMap, String nombreArchivo) throws IOException {
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo, true));
        try  {
            oos.writeObject(hashMap);
        } catch (IOException e) {
            System.err.println("Error al guardar el HashMap en el archivo binario: " + e.getMessage());
            throw e;
        }
    }

}
