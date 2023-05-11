package link;

import archivo.Archivo;

public class Link extends Archivo {
    private Archivo archivoEnlazado;

    public Link(String nombre, Archivo archivoEnlazado) {
        super(nombre, 0);
        this.archivoEnlazado = archivoEnlazado;
    }

    public Archivo getArchivoEnlazado() {
        return archivoEnlazado;
    }

    public void setArchivoEnlazado(Archivo archivoEnlazado) {
        this.archivoEnlazado = archivoEnlazado;
    }

    @Override
    public int calcularTamaño() {
        return archivoEnlazado.calcularTamaño();
    }
}