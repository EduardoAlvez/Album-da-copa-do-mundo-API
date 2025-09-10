package dsc.projeto.figurinhasdacopa.Services;

import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Repositorys.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    //CONSTRUTOR
    UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    public List<Usuario> listUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario adicionar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario UsuarioPoId(Long idUsuario) {
        return usuarioRepository.findById(idUsuario).get();
    }

    public Usuario atualizar(Long idUsuario, Usuario usuario) {
        Optional<Usuario> usuarioAtualizado = usuarioRepository.findById(idUsuario);

        if (usuarioAtualizado.isPresent()){
            BeanUtils.copyProperties(usuario, usuarioAtualizado.get(), "id");
            return usuarioRepository.save(usuarioAtualizado.get());
        }
        throw new RuntimeException("Algo deu errado!");
    }


    public void deletar(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
