import java.util.Objects;

public class Usuario implements Cloneable{
    private String nombre;
    private String apellidos;
    private String estadocivil;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    @Override
    public String toString() {
        return "Usarios{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estadocivil='" + estadocivil + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usarios = (Usuario) o;
        return edad == usarios.edad && Objects.equals(nombre, usarios.nombre) && Objects.equals(apellidos, usarios.apellidos) && Objects.equals(estadocivil, usarios.estadocivil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, estadocivil, edad);
    }

    @Override
    protected Usuario clone() {
        Usuario clonUsario = new Usuario();
        clonUsario.setNombre(this.getNombre());
        clonUsario.setApellidos(this.getApellidos());
        clonUsario.setEdad(this.getEdad());
        return clonUsario;
    }
}
