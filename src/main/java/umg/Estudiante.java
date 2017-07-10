package umg;

import java.util.ArrayList;

/**
 * Created by XavRuiz on 7/9/2017.
 */
public class Estudiante {

    private String nombreEstudiante;
    private int edad;

    private ArrayList<Asignatura> asignaturaList = null;

    public Estudiante() {
        asignaturaList = new ArrayList<Asignatura>();
    }

    public Estudiante(String nombreEstudiante, int edad) {
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //se calcula el promedio
    public float promedio() {
        float suma = 0;
        for (Asignatura asignatura : asignaturaList) {

            suma += asignatura.getNota();
        }
        return (suma / asignaturaList.size());
    }

    //metodo que recibe asignatura
    public void addAsignatura(Asignatura asignatura) {

        asignaturaList.add(asignatura);
    }
}
