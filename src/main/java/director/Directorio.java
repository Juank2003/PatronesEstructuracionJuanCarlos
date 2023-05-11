package director;

import archivo.Archivo;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Archivo {
    private List<Archivo> archivos = new ArrayList<>();

    public Directorio(String nombre) {
        super(nombre, 0);
    }

    public int getTamaño() {
        long tamaño = 0;
        for (Archivo archivo : archivos) {
            tamaño += archivo.getTamaño();
        }
        return (int) tamaño;
    }

    @Override
    public int calcularTamaño() {
        return (int) getTamaño();
    }

    public void añadir(Archivo archivo) {
        archivos.add(archivo);
    }
}
