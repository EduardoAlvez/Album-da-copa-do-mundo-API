package dsc.projeto.figurinhasdacopa.Controllers;

import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import dsc.projeto.figurinhasdacopa.Models.Dto.FigurinhaDTO;
import dsc.projeto.figurinhasdacopa.Services.FigurinhaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/figurinhas")
public class FigurinhaController {

    private FigurinhaService figurinhasService;

    public FigurinhaController(FigurinhaService figurinhasService) {
        this.figurinhasService = figurinhasService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Figurinha> todasFigurinhas(){
        return figurinhasService.listFigurinhas();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/selecao/{nomeSelecao}")
    public List<Figurinha> todasFigurinhasPorSelecao(@PathVariable String nomeSelecao){
        return figurinhasService.listFigurinhasPorSelecao(nomeSelecao);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Figurinha adicionarFigurinhas(@RequestBody FigurinhaDTO figurinhaDTO){
        return figurinhasService.adicionar(figurinhaDTO);

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuario/{idUsuario}")
    public List<Figurinha> todasFigurinhasPorUsuario(@PathVariable Long idUsuario){
        return figurinhasService.listFigurinhasPorUsuario(idUsuario);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{idFigurinha}")
    public Figurinha atualizarFigurinha(@PathVariable Long idFigurinha, @RequestBody FigurinhaDTO figurinhadto){
        return figurinhasService.atualizar(idFigurinha, figurinhadto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{idFigurinha}")
    public void deletarFigurinha(@PathVariable Long idFigurinha){
        figurinhasService.deletar(idFigurinha);
    }

}
