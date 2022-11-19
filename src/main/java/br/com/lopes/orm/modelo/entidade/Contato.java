package br.com.lopes.orm.modelo.entidade;

import jakarta.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tipo_contato")
    @Enumerated(EnumType.STRING)
    private TipoContato tipo;

    private String valor;

    public Contato() {
        // TODO Auto-generated constructor stub
    }

    public Contato(TipoContato tipo, String valor) {
        super();
        this.tipo = tipo;
        this.valor = valor;
    }



    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Contato [id=" + id + ", tipo=" + tipo + ", valor=" + valor + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }
}
