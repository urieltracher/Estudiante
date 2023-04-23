
package com.mycompany.estudiante;


public class Estudiante {
    
    
    private String nombre;
    private double promedio;
    
    
    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        setPromedio(promedio);
    }
    
    // Métodos de acceso y modificación
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 100.0) {
            this.promedio = promedio;
        } else {
            this.promedio = 0.0;
        }
    }
    
    
    public String obtenerCalificacionEstudiante() {
        if (promedio >= 90.0) {
            return "A";
        } else if (promedio >= 80.0) {
            return "B";
        } else if (promedio >= 70.0) {
            return "C";
        } else if (promedio >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}

