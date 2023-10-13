package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PetClienteDetalhadoResponse {
    UUID idPet;
    String nomePet;
    Porte porte;
    TipoPet tipo;
    String microship;
    String raca;
    SexoPet sexo;
    String pelagemCor;
    LocalDate dataNascimento;
    String rga;
    Integer peso;

    public PetClienteDetalhadoResponse(Pet pet) {
        this.idPet = pet.getIdPet();
        this.nomePet = pet.getNomePet();
        this.porte = pet.getPorte();
        this.tipo = pet.getTipo();
        this.microship = pet.getMicroship();
        this.raca = pet.getRaca();
        this.sexo = pet.getSexo();
        this.pelagemCor = pet.getPelagemCor();
        this.dataNascimento = pet.getDataNascimento();
        this.rga = pet.getRga();
        this.peso = pet.getPeso();
    }
}
