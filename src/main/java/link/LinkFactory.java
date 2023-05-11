package link;

import archivo.Archivo;
import archivo.ArchivoFactory;

public class LinkFactory implements ArchivoFactory {
    private Archivo archivoEnlazado;

    public LinkFactory(Archivo archivoEnlazado) {
        this.archivoEnlazado = archivoEnlazado;
    }

    @Override
    public Archivo crearArchivo(String nombre) {
        return new Link(nombre, archivoEnlazado);
    }
}