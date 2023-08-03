import java.util.Date;

class Tramite {
    int Numero;
    Date Fecha;
    Alumno Alumno;
    String Estado;
    public Tramite(int numero, Date fecha, Alumno alumno, String estado) {
        Numero = numero;
        Fecha = fecha;
        Alumno = alumno;
        Estado = estado;
    }
}