package dsc.projeto.figurinhasdacopa.Repositorys;

import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import dsc.projeto.figurinhasdacopa.Models.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
