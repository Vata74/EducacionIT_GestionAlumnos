import java.util.ArrayList;
import java.util.List;

class Asignatura {
    String Nombre;
    String Tipo;
    int Horas;
    int Cuatrimestre;
    List<Profesor> Profesores;
    public Asignatura(String nombre, String tipo, int horas, int cuatrimestre) {
        Nombre = nombre;
        Tipo = tipo;
        Horas = horas;
        Cuatrimestre = cuatrimestre;
        Profesores = new ArrayList<>();
    }

    void agregarProfesor(Profesor profesor) {
        Profesores.add(profesor);
    }
}