public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(String dni, String nombre, String apellido, String email, String direccion) {
        if(dni==null || dni.trim().isEmpty()) {// si está vacío, es null o son solo espacios
            throw new IllegalArgumentException("El dni no puede estar vacio.");
        }
        if(nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if(apellido==null||apellido.trim().isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacio.");
        }
        if(email==null || !email.contains("@")){//si esta vacio o si no contiene el arroba{
            throw new IllegalArgumentException("El email debe contener @.");
        }
        if (direccion==null || direccion.trim().isEmpty()){
            throw new IllegalArgumentException("La direccion no puede estar vacia.");
        }

        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
