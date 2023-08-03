import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona("12345678", "Agustin Vivas", "Gutierrez 256");
        Persona persona2 = new Persona("87654321", "Santiago Condori", "Rivadavia 492");


        Carrera carrera1 = new Carrera("Ingeniería Informática", "Sede A");
        Carrera carrera2 = new Carrera("Administración de Empresas", "Sede B");

        Asignatura asignatura1 = new Asignatura("Programación Java", "Obligatoria", 60, 1);
        Asignatura asignatura2 = new Asignatura("Gestión de Proyectos", "Obligatoria", 40, 2);


        Profesor profesor1 = new Profesor("P123", persona1, "Informática");
        Profesor profesor2 = new Profesor("P456", persona2, "Administración");


        carrera1.agregarAsignatura(asignatura1);
        carrera2.agregarAsignatura(asignatura2);
        carrera1.agregarProfesor(profesor1);
        carrera2.agregarProfesor(profesor2);


        Alumno alumno1 = new Alumno("A001", persona1);  // Se pasa la persona1 como argumento


        alumno1.inscribirMateria(asignatura1);
        AsignaturaCursada asignaturaCursada = new AsignaturaCursada(alumno1, asignatura1);
        asignaturaCursada.registrarNota(8.5, 9.0);
        alumno1.HistorialAcademico.add(asignaturaCursada);

        Tramite tramite1 = new Tramite(1, new Date(), alumno1, "Pendiente");
        alumno1.iniciarTramite(tramite1);

        alumno1.inscribirCarrera(carrera1);

        alumno1.inscribirMateria(asignatura2);
        AsignaturaCursada asignaturaCursada2 = new AsignaturaCursada(alumno1, asignatura2);
        asignaturaCursada2.registrarNota(7.8, 8.5);
        alumno1.HistorialAcademico.add(asignaturaCursada2);

        asignatura1.agregarProfesor(profesor1);
        asignatura2.agregarProfesor(profesor2);

        System.out.println("Alumno: " + alumno1.getNombre());
        System.out.println("Carrera: " + alumno1.Carrera.Nombre);
        System.out.println("Asignaturas inscritas:");

        for (Asignatura asignatura : alumno1.Materias) {
            System.out.println("- " + asignatura.Nombre);
        }

        System.out.println("Asignaturas cursadas:");

        for (AsignaturaCursada asicu : alumno1.HistorialAcademico) {
            System.out.println("- " + asicu.Asignatura.Nombre + ": Nota " + asicu.Nota);
        }

    }
}