package dsc.projeto.figurinhasdacopa.Repositorys;

import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FigurinhasRepository extends JpaRepository<Figurinha, Long> {

    public List<Figurinha> findAllByNomeSelecao(String nomeSelecao);
    public List<Figurinha> findAllByUserId(Long id);
}
