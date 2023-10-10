package br.com.petz.clientepet.application.api;

import br.com.petz.clientepet.cliente.domain.Cliente;
import jakarta.validation.Valid;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {
    UUID idCliente;
    String nomeCompleto;
    String cpf;
    String email;
    String celular;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        // clientes.stream().map(c -> new ClienteListResponse(c)).collect(Collectors.toList());
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }

    public ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
    }
}
