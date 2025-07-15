package controllers;

import models.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LibroController {
    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = (b1, b2) -> {
            int tituloCmp = b2.getTitulo().compareTo(b1.getTitulo());
            if (tituloCmp != 0) return tituloCmp;

            int anioCmp = Integer.compare(b1.getAnio(), b2.getAnio());
            if (anioCmp != 0) return anioCmp;

            return 0;
        };

        Set<Book> librosOrdenados = new TreeSet<>(comparador);
        librosOrdenados.addAll(libros);
        return librosOrdenados;
    }
}
