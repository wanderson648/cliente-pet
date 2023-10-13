package br.com.petz.clientepet.pet.application.repository;

import br.com.petz.clientepet.pet.domain.Pet;

import java.util.List;
import java.util.UUID;

public interface PetRespository {
    Pet salvaPet(Pet pet);
    List<Pet> buscaPetsDoClienteComId(UUID idCliente);
    Pet buscaPetPeloId(UUID idPet);
}
