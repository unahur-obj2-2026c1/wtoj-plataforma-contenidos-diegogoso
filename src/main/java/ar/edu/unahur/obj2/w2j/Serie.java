package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.List;

// Serie - contiene temporadas
public class Serie extends Contenido {
    private List<Temporada> temporadas;
    
    public Serie(String titulo, double costoBase) {
        super(titulo, costoBase);
        this.temporadas = new ArrayList<>();
    }
    
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }
    
    @Override
    public double calcularCosto() {
        double promedio = temporadas.stream()
                .flatMap(temporada -> temporada.getEpisodios().stream())
                .mapToDouble(Episodio::getCostoBase)
                .average()
                .orElse(0);
        return getCostoBase() + promedio;
    }
}