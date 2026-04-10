package ar.edu.unahur.obj2.w2j;

public class Pelicula extends Contenido {
    public Pelicula(String titulo, double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    public double calcularCosto() {
        return getCostoBase();
    }
    

}
