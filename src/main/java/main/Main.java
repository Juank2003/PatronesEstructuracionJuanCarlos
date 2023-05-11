package main;

import archivo.Archivo;
import archivo.ArchivoFactory;
import director.Directorio;
import director.DirectorioFactory;
import file.FicheroNormalFactory;
import link.Link;
import link.LinkFactory;

public class Main {
    public static void main(String[] args) {
        // Crear algunos archivos
        ArchivoFactory dirFactory = new DirectorioFactory() {
            @Override
            public Directorio crearArchivo(String nombre) {
                return null;
            }
        };
        ArchivoFactory fileFactory = new FicheroNormalFactory();
        ArchivoFactory linkFactory = new LinkFactory(null);

        Archivo dir1 = dirFactory.crearArchivo("directorio1");
        Archivo file1 = fileFactory.crearArchivo("archivo1");
        Archivo file2 = fileFactory.crearArchivo("archivo2");
        Archivo file3 = fileFactory.crearArchivo("archivo3");
        Archivo link1 = linkFactory.crearArchivo("enlace1");

        // Añadir archivos al directorio
        ((Directorio) dir1).añadir(file1);
        ((Directorio) dir1).añadir(file2);
        ((Directorio) dir1).añadir(file3);

        // Enlazar archivo al enlace
        ((Link) link1).setArchivoEnlazado(dir1);

        // Mostrar información de los archivos
        System.out.println("Información de archivos:");
        System.out.println("Nombre: " + dir1.getNombre() + ", Tamaño: " + dir1.calcularTamaño());
        System.out.println("Nombre: " + file1.getNombre() + ", Tamaño: " + file1.calcularTamaño());
        System.out.println("Nombre: " + file2.getNombre() + ", Tamaño: " + file2.calcularTamaño());
        System.out.println("Nombre: " + file3.getNombre() + ", Tamaño: " + file3.calcularTamaño());
        System.out.println("Nombre: " + link1.getNombre() + ", Tamaño: " + link1.calcularTamaño());
    }
}
