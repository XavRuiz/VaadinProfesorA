package umg;

/**
 * Created by XavRuiz on 7/9/2017.
 */
public class Asignatura {

    private String nombre;
    private int nota;
    private int cantEva;

    public Asignatura (){

    }

    public Asignatura(String nombre, int nota, int cantEva) {
        this.nombre = nombre;
        this.nota = nota;
        this.cantEva = cantEva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getCantEva() {
        return cantEva;
    }

    public void setCantEva(int cantEva) {
        this.cantEva = cantEva;
    }
}
