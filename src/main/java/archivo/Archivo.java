package archivo;


public abstract class Archivo {
    protected String nombre;
    protected int tamaño;

    public Archivo(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public abstract int calcularTamaño();
}
