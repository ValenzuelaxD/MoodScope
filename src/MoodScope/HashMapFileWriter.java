/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoodScope;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jorge_Silva
 */
public class HashMapFileWriter {

      public static void guardarHashMapEnArchivo(HashMap<String, String> hashMap, String nombreArchivo) throws IOException {
        FileWriter writer = new FileWriter(nombreArchivo, true);
        try {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                writer.write(entry.getKey() + ":\n" + entry.getValue() + "\n\n");
            }
        } finally {
            writer.close();
        }
    }
}
