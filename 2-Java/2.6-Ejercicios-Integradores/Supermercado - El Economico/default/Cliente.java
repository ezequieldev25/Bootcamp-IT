public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;

    public Cliente(String dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
        
    public String getDni() {
        return dni;
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("DNI: {} \nNombre: {}\nApellido: {}", dni, nombre, apellido);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if( obj == null || !(obj instanceof Cliente)) return false;
        Cliente cliente = (Cliente) obj;
        return this.equals(cliente.getDni());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + dni.hashCode();
        return result;
    }
}