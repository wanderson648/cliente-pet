package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Value
public class ClienteRequest {
    @NotBlank
    String nomeCompleto;
    @NotBlank
    @Email
    String email;
    @NotBlank
    String celular;
    String telefone;
    Sexo sexo;
    @NotNull
    LocalDate dataNascimento;
    @CPF
    String cpf;
    @NotNull
    Boolean aceitaTermos;

}
