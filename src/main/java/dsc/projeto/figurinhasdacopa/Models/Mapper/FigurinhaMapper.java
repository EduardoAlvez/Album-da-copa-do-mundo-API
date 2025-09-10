package dsc.projeto.figurinhasdacopa.Models.Mapper;


import dsc.projeto.figurinhasdacopa.Models.Dto.FigurinhaDTO;
import dsc.projeto.figurinhasdacopa.Models.Figurinha;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FigurinhaMapper {


    private final ModelMapper modelMapper;


    // Construtor
    public FigurinhaMapper(ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
    }

    // Metodos

    public FigurinhaDTO toDto(Figurinha figurinhas){
        return modelMapper.map(figurinhas, FigurinhaDTO.class);
    }

    public Figurinha toEntity(FigurinhaDTO figurinhasDTO){
        return modelMapper.map(figurinhasDTO, Figurinha.class);
    }

}
