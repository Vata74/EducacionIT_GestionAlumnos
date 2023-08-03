class Persona {
    String Dni;
    String Nombre;
    String Direccion;

    public Persona(String dni, String nombre, String direccion) {
        Dni = dni;
        Nombre = nombre;
        Direccion = direccion;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}