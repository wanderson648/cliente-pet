package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PetAlteracaoRequest {
    @NotBlank
    String nomePet;
    Porte porte;
    @NotNull
    TipoPet tipo;
    String microship;
    @NotBlank
    String raca;
    @NotNull
    SexoPet sexo;
    String pelagemCor;
    @NotNull
    LocalDate dataNascimento;
    String rga;
    Integer peso;
}
