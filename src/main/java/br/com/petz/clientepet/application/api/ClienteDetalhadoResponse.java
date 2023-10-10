package br.com.petz.clientepet.application.api;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    UUID idCliente;
    String nomeCompleto;
    String cpf;
    String email;
    String celular;
    String telefone;
    Sexo sexo;
    Boolean aceitaTermos;
    LocalDateTime dataHoraCadastro;
}
