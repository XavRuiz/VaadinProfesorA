package umg;

import java.util.ArrayList;

/**
 * Created by XavRuiz on 7/9/2017.
 */
public class Profesor {

    private String nombre;
    private String especialidad;

    private ArrayList<Estudiante> estudianteList = null;

    public Profesor() {
        estudianteList = new ArrayList<Estudiante>();
    }

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //METODO PARA AGREGAR ESTUDIANTE
    public void addEstudiante(Estudiante estudiante) {
        estudianteList.add(estudiante);
    }


    public void promedio() {
        float notaAlta = 0;
        String nombreEstudianteNotaAlta = " ";
        for (Estudiante estudiante : estudianteList
                ) {

            if (estudiante.promedio() >= notaAlta) {
                notaAlta = estudiante.promedio();
                nombreEstudianteNotaAlta = estudiante.getNombreEstudiante();
            }
        }
    }
}
