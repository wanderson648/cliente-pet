package br.com.petz.clientepet.cliente.domain;

import br.com.petz.clientepet.cliente.application.api.ClienteAteracaoRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.telefone = clienteRequest.getTelefone();
        this.sexo = clienteRequest.getSexo();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.cpf = clienteRequest.getCpf();
        this.aceitaTermos = clienteRequest.getAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void alteraCliente(ClienteAteracaoRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.celular = clienteRequest.getCelular();
        this.telefone = clienteRequest.getTelefone();
        this.sexo = clienteRequest.getSexo();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.aceitaTermos = clienteRequest.getAceitaTermos();
        this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
    }
}
