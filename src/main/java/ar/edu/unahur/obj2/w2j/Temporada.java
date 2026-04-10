package ar.edu.unahur.obj2.w2j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Temporada {
    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public Collection<Episodio> getEpisodios() {
        return Collections.unmodifiableList(episodios);
    }

    public double getCostoPromedio() {
        return episodios.stream()
                .mapToDouble(Episodio::getCostoBase)
                .average()
                .orElse(0);
    }

}
