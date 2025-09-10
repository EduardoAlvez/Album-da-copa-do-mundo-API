package dsc.projeto.figurinhasdacopa.Services;

import dsc.projeto.figurinhasdacopa.Models.Album;
import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Repositorys.UsuarioRepository;
import dsc.projeto.figurinhasdacopa.Repositorys.AlbumRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;

    //CONSTRUTOR
    AlbumService(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }


    public List<Album> listAlbum() {
        return albumRepository.findAll();
    }

    public Album adicionar(Album album) {
        return albumRepository.save(album);
    }

    public Album AlbumPoId(Long idAlbum) {
        return albumRepository.findById(idAlbum).get();
    }

    public Album atualizar(Long idalbum, Album album) {
        Optional<Album> albumAtualizado = albumRepository.findById(idalbum);

        if (albumAtualizado.isPresent()){
            BeanUtils.copyProperties(album, albumAtualizado.get(), "id");
            return albumRepository.save(albumAtualizado.get());
        }
        throw new RuntimeException("Algo deu errado!");
    }


    public void deletar(Long idAlbum) {
        albumRepository.deleteById(idAlbum);
    }
}
