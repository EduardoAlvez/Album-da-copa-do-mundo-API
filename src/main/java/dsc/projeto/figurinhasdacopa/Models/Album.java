package dsc.projeto.figurinhasdacopa.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;


    @ManyToMany
    @JoinTable(name = "Album_com_figurinhas",
    joinColumns = @JoinColumn(name = "album_id"),
    inverseJoinColumns = @JoinColumn(name = "figurinha_id"))
    private List<Figurinha> figurinhas;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users user;

}
