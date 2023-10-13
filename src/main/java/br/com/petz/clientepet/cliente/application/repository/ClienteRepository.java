package br.com.petz.clientepet.cliente.application.repository;


import br.com.petz.clientepet.cliente.application.api.ClienteAteracaoRequest;
import br.com.petz.clientepet.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
    Cliente buscaClienteAtravesId(UUID idCliente);
    void deletaCliente(Cliente cliente);
}
