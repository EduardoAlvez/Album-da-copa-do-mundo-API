package dsc.projeto.figurinhasdacopa.Services;

import dsc.projeto.figurinhasdacopa.Models.Mapper.FigurinhaMapper;
import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import dsc.projeto.figurinhasdacopa.Models.Dto.FigurinhaDTO;
import dsc.projeto.figurinhasdacopa.Repositorys.FigurinhasRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class FigurinhaService {

    private final FigurinhasRepository figurinhasRepository;
    private final FigurinhaMapper figurinhaMapper;

    //CONSTRUTOR
    FigurinhaService(FigurinhasRepository figurinhasRepository, FigurinhaMapper figurinhaMapper){
        this.figurinhasRepository = figurinhasRepository;
        this.figurinhaMapper = figurinhaMapper;
    }


    public List<Figurinha> listFigurinhas() {
        return figurinhasRepository.findAll();
    }

    public List<Figurinha> listFigurinhasPorSelecao(String nomeSelecao){
       return figurinhasRepository.findAllByNomeSelecao(nomeSelecao);
    }

    public List<Figurinha> listFigurinhasPorUsuario(Long idUsuario) {
        return figurinhasRepository.findAllByUserId(idUsuario);
    }

    public Figurinha adicionar(FigurinhaDTO figurinhasDto) {

        Figurinha figurinha = figurinhaMapper.toEntity(figurinhasDto);
        return figurinhasRepository.save(figurinha);
    }

    public Figurinha atualizar(Long idFigurinha, FigurinhaDTO figurinhaDto) {
        Figurinha figurinha = figurinhaMapper.toEntity(figurinhaDto);
        Optional<Figurinha> figurinhaAtualizada = figurinhasRepository.findById(idFigurinha);
        if (figurinhaAtualizada.isPresent()){
            BeanUtils.copyProperties(figurinha, figurinhaAtualizada.get(), "id");
            return figurinhasRepository.save(figurinhaAtualizada.get());
        }
        throw new RuntimeException("Algo deu errado!");
    }

    public void deletar(Long idFigurinha) {
        figurinhasRepository.deleteById(idFigurinha);
    }
}
