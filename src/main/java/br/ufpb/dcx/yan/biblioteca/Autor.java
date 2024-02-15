package br.ufpb.dcx.yan.biblioteca;

import java.util.Objects;

public class Autor implements  Comparable<Autor>, Serialializable{
    private String name;
    private String dataNacimento;
    private  String codigo;
//construtor que passa o nome e a data de nacimento do autor
    public Autor(String codigo,String name, String dataNacimento,) {
        this.codigo = codigo;
        this.name = name;
        this.dataNacimento = dataNacimento;
    }
//construtor so com o nome

    public Autor( String codigo ) {
        this(codigo,"","");
    }
//equals hashcode comparar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(codigo, autor.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    @Override
    public int compareTo(Autor o) {
        if (this.name == null && o.name == null) {
            return 0;
        } else if (name == null && o.name != null) {
            return -1;
        } else if (o.name == null) {
            return 1;
        } else {
            return this.name.compareTo(o.compareTo(o.name);
        }
    }

    private String compareTo(String name) {
    }