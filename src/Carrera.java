import java.util.ArrayList;
import java.util.List;

class Carrera {
    String Nombre;
    String Sede;
    List<Asignatura> Asignaturas;
    List<Profesor> Profesores;

    public Carrera(String nombre, String sede) {
        Nombre = nombre;
        Sede = sede;
        Asignaturas = new ArrayList<>();
        Profesores = new ArrayList<>();
    }

    void agregarAsignatura(Asignatura asignatura) {
        Asignaturas.add(asignatura);
    }

    void agregarProfesor(Profesor profesor) {
        Profesores.add(profesor);
    }
}