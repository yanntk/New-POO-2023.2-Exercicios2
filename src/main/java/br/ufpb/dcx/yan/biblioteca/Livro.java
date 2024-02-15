package br.ufpb.dcx.yan.biblioteca;

import java.util.List;

class Livro {
    private String titulo;
    private List<String> autor;
    private int anoDePublicacao;

    public Livro(String titulo, List<String> autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
  }
}
