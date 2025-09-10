package dsc.projeto.figurinhasdacopa.Models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Figurinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeSelecao;
    private String nomeJogador;
    private int idSelecao;
    private Long userId;

    @ManyToMany(mappedBy = "figurinhas")
    private List<Album> albums;

    public Figurinha() {
    }
    // Construtor
    public Figurinha(String nomeJogador, int idSelecao, String nomeSelecao, Long userId) {
        this.nomeJogador = nomeJogador;
        this.idSelecao = idSelecao;
        this.nomeSelecao = nomeSelecao;
        this.userId = userId;
    }

    // Getters e Setters
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdSelecao() {
        return idSelecao;
    }

    public void setIdSelecao(int idSelecao) {
        this.idSelecao = idSelecao;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id){
        this.userId = id;
    }

    public Long getId() {
        return id;
    }

    // Metodo toString para exibir informações da figurinha
    @Override
    public String toString() {
        return "Figurinhas{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idSelecao=" + idSelecao +
                ", nomeSelecao='" + nomeSelecao + '\'' +
                ", codigoUnico='" + id + '\'' +
                '}';
    }
}
