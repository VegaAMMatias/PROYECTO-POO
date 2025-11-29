package clases;

public class Empleado {

    private String dni;
    private String nombres;
    private String apellidos;
    private String rol;
    private String usuario;
    private String password;
    private String estado;

    public Empleado() {
    }

    public Empleado(String dni, String nombres, String apellidos,
                    String rol, String password, String estado) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        this.usuario = dni; // Por defecto el usuario será el DNI
        this.password = password;
        this.estado = estado;
    }

    public Empleado(String dni, String nombres, String apellidos, String rol) {
        this(dni, nombres, apellidos, rol, "", "ACTIVO");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}