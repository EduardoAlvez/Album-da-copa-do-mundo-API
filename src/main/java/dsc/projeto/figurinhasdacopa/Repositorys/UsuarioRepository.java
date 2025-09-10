package dsc.projeto.figurinhasdacopa.Repositorys;

import dsc.projeto.figurinhasdacopa.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
