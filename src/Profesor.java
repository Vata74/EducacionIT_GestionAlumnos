class Profesor extends Persona {
    String Id_Profesor;
    String Departamento;

    public Profesor(String idProfesor, Persona datos, String departamento) {
        super(datos.Dni, datos.Nombre, datos.Direccion);
        Id_Profesor = idProfesor;
        Departamento = departamento;
    }
}