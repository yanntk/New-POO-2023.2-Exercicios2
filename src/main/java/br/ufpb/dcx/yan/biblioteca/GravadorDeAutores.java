package br.ufpb.dcx.yan.biblioteca;

public class GravadorDeAutores {
    private  String nomeArquivoAutores = "autores.dat";

    public  GravadorDeAutores(String nomeArquivo){
        this.nomeArquivoAutores = nomeArquivo;

    }
    public GravadorDeAutores(){
        this(nomeArquivo:"autores.dat");

    }
}
