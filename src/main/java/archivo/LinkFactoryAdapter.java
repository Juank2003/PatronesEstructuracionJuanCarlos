package archivo;

import link.Link;

public interface LinkFactoryAdapter extends ArchivoFactory {
    Link crearLink(String nombre, Archivo archivoEnlazado);
}