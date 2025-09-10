package dsc.projeto.figurinhasdacopa.Models.Dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FigurinhaDTO {

    @NotBlank(message = "Não pode ser null ou vázio.")
    @NotNull
    private String nomeSelecao;
    @NotBlank(message = "Não pode ser null ou vázio.")
    @NotNull
    private String nomeJogador;
    private int idSelecao;
    private Long userId;

    public FigurinhaDTO() {
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

    // Metodo toString para exibir informações da figurinha
    @Override
    public String toString() {
        return "Figurinhas{" +
                "nomeJogador='" + nomeJogador + '\'' +
                ", idSelecao=" + idSelecao +
                ", nomeSelecao='" + nomeSelecao + '\'' +
                '}';
    }
}
