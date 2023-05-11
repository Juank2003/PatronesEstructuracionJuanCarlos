package file;

import archivo.Archivo;
import archivo.ArchivoFactory;

public class FicheroNormalFactory implements ArchivoFactory {
    public Archivo crearArchivo(String nombre) {
        return new FicheroNormal(nombre, 0);
    }
}