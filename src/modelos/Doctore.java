package modelos;

public class Doctore {
    private String id;
    private String fecha;
    private String nombre;
    private String sexo;
    private String tipo;

    public Doctore() {
    }

    public Doctore(String id, String fecha, String nombre, String sexo, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.sexo = sexo;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Doctore{" + "id=" + id + ", fecha=" + fecha + ", nombre=" + nombre + ", sexo=" + sexo + ", tipo=" + tipo + '}';
    }
    
}
