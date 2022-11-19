package br.com.lopes.orm.modelo.entidade;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("P")
public class Livro  extends  Produto{

    private String titulo;
    private int isbn;
    private Date edicao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setEdicao(Date edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public Date getEdicao() {
        return edicao;
    }
}
