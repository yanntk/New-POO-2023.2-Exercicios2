package br.ufpb.dcx.yan.biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaAutor {
    private static List<? super Autor> collections;

    public static void main(String [] args){
        Autor autor1 = new Autor("001", "Machado de assis","");
        Autor autor2 = new Autor("002", "Dante Aligrieri","");
        Autor autor3 = new Autor("002", "Pou","");
        System.out.println(autor1.compareTo(autor2));

        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        collections.sort((Comparator<? super Autor>));
        for (Autor autor: autores) System.out.println(autor.getName();
        }
    }
}
