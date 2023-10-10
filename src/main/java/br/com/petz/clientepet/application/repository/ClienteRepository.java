package br.com.petz.clientepet.application.repository;


import br.com.petz.clientepet.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
    Cliente buscaClienteAtravesId(UUID idCliente);
}
