package clases;

public class Huesped {

    private String dni;
    private String nombres;
    private String apellidos;
    private String contacto;
    private String email;
    private String estado;

    public Huesped() {
    }

    public Huesped(String dni, String nombres, String apellidos, String contacto, String email, String estado) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contacto = contacto;
        this.email = email;
        this.estado = estado;
    }

    public Huesped(String dni, String nombres, String apellidos, String contacto) {
        this(dni, nombres, apellidos, contacto, "", "ACTIVO");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}