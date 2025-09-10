package dsc.projeto.figurinhasdacopa.Repositorys;

import dsc.projeto.figurinhasdacopa.Models.Album;
import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
