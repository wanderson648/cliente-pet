package br.com.petz.clientepet.pet.domain;

import br.com.petz.clientepet.pet.application.api.PetAlteracaoRequest;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPet", updatable = false, unique = true, nullable = false)
    private UUID idPet;
    @Column(columnDefinition = "uuid", name = "idClienteTutor", nullable = false)
    private UUID idClienteTutor;
    @NotBlank
    private String nomePet;
    @Enumerated(EnumType.STRING)
    private Porte porte;
    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoPet tipo;
    private String microship;
    @NotBlank
    private String raca;
    @Enumerated(EnumType.STRING)
    @NotNull
    private SexoPet sexo;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;


    public Pet(UUID idCliente, PetRequest petRequest) {
        this.idClienteTutor = idCliente;
        this.nomePet = petRequest.getNomePet();
        this.porte = petRequest.getPorte();
        this.tipo = petRequest.getTipo();
        this.microship = petRequest.getMicroship();
        this.raca = petRequest.getRaca();
        this.sexo = petRequest.getSexo();
        this.pelagemCor = petRequest.getPelagemCor();
        this.dataNascimento = petRequest.getDataNascimento();
        this.rga = petRequest.getRga();
        this.peso = petRequest.getPeso();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void altera(PetAlteracaoRequest petRequest) {
        this.nomePet = petRequest.getNomePet();
        this.porte = petRequest.getPorte();
        this.tipo = petRequest.getTipo();
        this.microship = petRequest.getMicroship();
        this.raca = petRequest.getRaca();
        this.sexo = petRequest.getSexo();
        this.pelagemCor = petRequest.getPelagemCor();
        this.dataNascimento = petRequest.getDataNascimento();
        this.rga = petRequest.getRga();
        this.peso = petRequest.getPeso();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
    }
}
