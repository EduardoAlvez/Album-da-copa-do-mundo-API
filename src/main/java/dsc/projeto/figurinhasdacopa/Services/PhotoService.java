package dsc.projeto.figurinhasdacopa.Services;

import dsc.projeto.figurinhasdacopa.Models.Photo;
import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Repositorys.UsuarioRepository;
import dsc.projeto.figurinhasdacopa.Repositorys.PhotoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {

    private final PhotoRepository photoRepository;

    //CONSTRUTOR
    PhotoService(PhotoRepository photoRepository){
        this.photoRepository = photoRepository;
    }


    public List<Photo> listPhoto() {
        return photoRepository.findAll();
    }

    public Photo adicionar(Photo photo) {
        return photoRepository.save(photo);
    }

    public Photo PhotoPoId(Long idPhoto) {
        return photoRepository.findById(idPhoto).get();
    }

    public Photo atualizar(Long idUsuario, Photo photo) {
        Optional<Photo> photoAtualizado = photoRepository.findById(idUsuario);

        if (photoAtualizado.isPresent()){
            BeanUtils.copyProperties(photo, photoAtualizado.get(), "id");
            return photoRepository.save(photoAtualizado.get());
        }
        throw new RuntimeException("Algo deu errado!");
    }


    public void deletar(Long idPhoto) {
        photoRepository.deleteById(idPhoto);
    }
}
