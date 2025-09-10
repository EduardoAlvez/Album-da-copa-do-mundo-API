package dsc.projeto.figurinhasdacopa.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;


    @OneToMany(mappedBy = "user")
    private List<Album> albuns;

    @OneToOne
    private Photo photo;
}
