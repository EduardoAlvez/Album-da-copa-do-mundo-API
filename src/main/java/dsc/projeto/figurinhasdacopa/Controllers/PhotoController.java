package dsc.projeto.figurinhasdacopa.Controllers;

import dsc.projeto.figurinhasdacopa.Models.Photo;
import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Services.PhotoService;
import dsc.projeto.figurinhasdacopa.Services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/photos")
public class PhotoController {

    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Photo> todasPhoto(){
        return photoService.listPhoto();
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Photo adicionarPhoto(@RequestBody Photo photo){
        return photoService.adicionar(photo);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{idPhotos}")
    public Photo photosPorId(@PathVariable Long idPhoto){
        return photoService.PhotoPoId(idPhoto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idPhotos}")
    public Photo atualizarUsuario(@PathVariable Long idPhoto, @RequestBody Photo photo){
        return photoService.atualizar(idPhoto, photo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idPhotos}")
    public void deletarUsuario(@PathVariable Long idPhoto){
        photoService.deletar(idPhoto);
    }

}
