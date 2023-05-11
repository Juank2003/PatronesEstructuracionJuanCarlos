package director;

import archivo.Archivo;
import archivo.ArchivoFactory;

public interface DirectorioFactory extends ArchivoFactory {
    @Override
    Directorio crearArchivo(String nombre);
}
