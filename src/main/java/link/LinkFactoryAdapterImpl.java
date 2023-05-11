package link;

import archivo.Archivo;
import archivo.ArchivoFactory;
import archivo.LinkFactoryAdapter;

public class LinkFactoryAdapterImpl implements LinkFactoryAdapter {
    private ArchivoFactory archivoFactory;

    public LinkFactoryAdapterImpl(ArchivoFactory archivoFactory) {
        this.archivoFactory = archivoFactory;
    }

    @Override
    public Archivo crearArchivo(String nombre) {
        // Utiliza el archivoFactory interno para crear un archivo
        return archivoFactory.crearArchivo(nombre);
    }

    @Override
    public Link crearLink(String nombre, Archivo archivoEnlazado) {
        // Crea un nuevo enlace utilizando el nombre y el archivo enlazado
        return new Link(nombre, archivoEnlazado);
    }
}