package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.pet.application.api.PetClienteDetalhadoResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.application.repository.PetRespository;
import br.com.petz.clientepet.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
    private final ClienteService clienteService;
    private final PetRespository petRespository;
    @Override
    public PetResponse criaPet(UUID idCliente, @Valid  PetRequest petRequest) {
        log.info("[inicia] PetApplicationService - criaPet");
        clienteService.buscaClienteAtravesId(idCliente);
        Pet pet = petRespository.salvaPet(new Pet(idCliente, petRequest));
        log.info("[finaliza] PetApplicationService - criaPet");
        return new PetResponse(pet.getIdPet());
    }

    @Override
    public List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente) {
        log.info("[inicia] PetApplicationService - buscaPetsDoClienteComId");
        clienteService.buscaClienteAtravesId(idCliente);
        List<Pet> petsDoCliente = petRespository.buscaPetsDoClienteComId(idCliente);
        log.info("[finaliza] PetApplicationService - buscaPetsDoClienteComId");
        return PetClienteListResponse.converte(petsDoCliente);
    }

    @Override
    public PetClienteDetalhadoResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet) {
        log.info("[inicia] PetApplicationService - buscaPetDoClienteComId");
        log.info("[finaliza] PetApplicationService - buscaPetDoClienteComId");
        return null;
    }
}
