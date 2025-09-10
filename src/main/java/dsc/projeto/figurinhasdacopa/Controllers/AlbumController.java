package dsc.projeto.figurinhasdacopa.Controllers;

import dsc.projeto.figurinhasdacopa.Models.Album;
import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Services.AlbumService;
import dsc.projeto.figurinhasdacopa.Services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/album")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Album> todosAlbum(){
        return albumService.listAlbum();
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Album adicionarAlbum(@RequestBody Album album){
        return albumService.adicionar(album);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{idAlbum}")
    public Album albumPorId(@PathVariable Long idAlbum){
        return albumService.AlbumPoId(idAlbum);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idAlbum}")
    public Album atualizarUsuario(@PathVariable Long idalbum, @RequestBody Album album){
        return albumService.atualizar(idalbum, album);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idAlbum}")
    public void deletarUsuario(@PathVariable Long idalbum){
        albumService.deletar(idalbum);
    }

}
