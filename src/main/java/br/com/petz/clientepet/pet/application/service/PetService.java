package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetRequest petRequest);
    List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
    PetClienteDetalhadoResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
    void deletePetDoClienteComId(UUID idCliente, UUID idPet);
    void alteraPetDoClienteComId(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
