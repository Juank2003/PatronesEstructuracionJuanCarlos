package file;

import archivo.Archivo;

public class FicheroNormal extends Archivo {
    public FicheroNormal(String nombre, int tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public int calcularTamaño() {
        return getTamaño();
    }
}