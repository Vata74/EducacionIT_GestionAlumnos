import java.util.ArrayList;
import java.util.List;

class Alumno extends Persona {
    String Id_Alumno;
    List<Asignatura> Materias;
    Carrera Carrera;
    List<Tramite> Tramites;
    List<AsignaturaCursada> HistorialAcademico;

    public Alumno(String idAlumno, Persona datos) {
        super(datos.getDni(), datos.getNombre(), datos.getDireccion());
        Id_Alumno = idAlumno;
        Materias = new ArrayList<>();
        Tramites = new ArrayList<>();
        HistorialAcademico = new ArrayList<>();
    }



    void inscribirMateria(Asignatura asignatura) {
        Materias.add(asignatura);
    }

    void iniciarTramite(Tramite tramite) {
        Tramites.add(tramite);
    }

    void inscribirCarrera(Carrera carrera) {
        Carrera = carrera;
    }

}