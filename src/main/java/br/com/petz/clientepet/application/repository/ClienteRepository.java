package br.com.petz.clientepet.application.repository;


import br.com.petz.clientepet.cliente.domain.Cliente;

import java.util.List;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaTodosClientes();
}
