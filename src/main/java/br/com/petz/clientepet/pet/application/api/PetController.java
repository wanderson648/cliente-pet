package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.application.service.PetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetApi {
    private final PetService petService;

    @Override
    public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("[idCliente] {} ", idCliente);
        log.info("[finaliza] PetController - postPet");
        return petService.criaPet(idCliente, petRequest);
    }

    @Override
    public List<PetClienteListResponse> getPetsDoClienteComId(UUID idCliente) {
        log.info("[inicia] PetController - getPetsDoClienteComId");
        log.info("[idCliente] {}", idCliente);
        List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClienteComId(idCliente);
        log.info("[finaliza] PetController - getPetsDoClienteComId");
        return petsDoCliente;
    }

    @Override
    public PetClienteDetalhadoResponse getPetDoClienteComId(UUID idCliente, UUID idPet) {
        log.info("[inicia] PetController - getPetDoClienteComId");
        log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
        log.info("[finaliza] PetController - getPetDoClienteComId");
        return null;
    }
}
