package br.com.petz.clientepet.pet.application.api;

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
}
