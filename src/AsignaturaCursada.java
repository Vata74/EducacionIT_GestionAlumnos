class AsignaturaCursada {
    Alumno Alumno;
    double Nota;
    Asignatura Asignatura;
    double Final;
    public AsignaturaCursada(Alumno alumno, Asignatura asignatura) {
        Alumno = alumno;
        Asignatura = asignatura;
    }

    void registrarNota(double nota, double ExamenFinal) {
        Nota = nota;
        Final = ExamenFinal;
    }
}