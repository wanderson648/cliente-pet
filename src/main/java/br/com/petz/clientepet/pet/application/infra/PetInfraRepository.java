package br.com.petz.clientepet.pet.application.infra;

import br.com.petz.clientepet.pet.application.repository.PetRespository;
import br.com.petz.clientepet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRespository {
    private final PetSpringDataJPARepository petSpringDataJPARepository;
    @Override
    public Pet salvaPet(Pet pet) {
        log.info("[inicia] PetInfraRepository - salvaPet");
        log.info("[finaliza] PetInfraRepository - salvaPet");
        return petSpringDataJPARepository.save(pet);
    }

    @Override
    public List<Pet> buscaPetsDoClienteComId(UUID idCliente) {
        log.info("[inicia] PetInfraRepository - buscaPetsDoClienteComId");
        var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
        log.info("[finaliza] PetInfraRepository - buscaPetsDoClienteComId");
        return pets;
    }
}
