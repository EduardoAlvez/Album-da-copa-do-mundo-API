package dsc.figurinhas.figurinhas_futebol.Models;

public class Figurinhas {
    
    private String nomeJogador;
    private int idSelecao;
    private String nomeSelecao;
    private String codigoUnico;

    // Construtor
    public Figurinhas(String nomeJogador, int idSelecao, String nomeSelecao, String codigoUnico) {
        this.nomeJogador = nomeJogador;
        this.idSelecao = idSelecao;
        this.nomeSelecao = nomeSelecao;
        this.codigoUnico = codigoUnico;
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

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    // Método toString para exibir informações da figurinha
    @Override
    public String toString() {
        return "Figurinhas{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idSelecao=" + idSelecao +
                ", nomeSelecao='" + nomeSelecao + '\'' +
                ", codigoUnico='" + codigoUnico + '\'' +
                '}';
    }
}
