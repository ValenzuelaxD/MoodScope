/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoodScope;

import java.util.ArrayList;

/**
 *
 * @author wzyx_
 */
public class SaludFisica extends CategoriasEstadoAnimo implements ProcesosEstadoAnimo {

    ArrayList<Double> RespuestasSaludFisica;
    ArrayList<Double> lista;

    public SaludFisica() {
        this.lista = new ArrayList<>();
        this.RespuestasSaludFisica = new ArrayList<>();
    }

    @Override
    public Double obtenerElementoEnPosicion() {
        return RespuestasSaludFisica.get(0);
    }
    
    public double calcularPromedio() {
        double sum = 0.0;
        for (double num : this.RespuestasSaludFisica) {
            sum += num;
        }
        System.out.println(sum);

        // Calcular el promedio
        return sum / this.RespuestasSaludFisica.size();
    }

    @Override
    public double calcularPromedio(ArrayList<Double> lista) {
        // Verificar si la lista está vacía
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        // Sumar todos los elementos de la lista
        double sum = 0.0;
        for (double num : lista) {
            sum += num;
        }

        // Calcular el promedio
        return sum / lista.size();
    }    
}

    

    
    
    

