package dsc.projeto.figurinhasdacopa.Controllers;

import dsc.projeto.figurinhasdacopa.Models.Usuario;
import dsc.projeto.figurinhasdacopa.Services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Usuario> todosUsuarios(){
        return usuarioService.listUsuario();
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Usuario adicionarUsuario(@RequestBody Usuario usuario){
        return usuarioService.adicionar(usuario);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuario/{idUsuario}")
    public Usuario usuarioPorId(@PathVariable Long idUsuario){
        return usuarioService.UsuarioPoId(idUsuario);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idUsuario}")
    public Usuario atualizarUsuario(@PathVariable Long idUsuario, @RequestBody Usuario usuario){
        return usuarioService.atualizar(idUsuario, usuario);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idUsuario}")
    public void deletarUsuario(@PathVariable Long idUsuario){
        usuarioService.deletar(idUsuario);
    }

}
