package br.com.petz.clientepet.application.repository;


import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
